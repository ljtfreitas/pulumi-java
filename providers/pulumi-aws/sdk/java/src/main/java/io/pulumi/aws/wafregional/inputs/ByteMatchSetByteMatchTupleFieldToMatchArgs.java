// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ByteMatchSetByteMatchTupleFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetByteMatchTupleFieldToMatchArgs Empty = new ByteMatchSetByteMatchTupleFieldToMatchArgs();

    /**
     * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. If the value of Type is any other value, omit Data.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ByteMatchSetByteMatchTupleFieldToMatchArgs(
        @Nullable Output<String> data,
        Output<String> type) {
        this.data = data;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ByteMatchSetByteMatchTupleFieldToMatchArgs() {
        this.data = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTupleFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTupleFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }

        public Builder data(@Nullable String data) {
            this.data = Output.ofNullable(data);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ByteMatchSetByteMatchTupleFieldToMatchArgs build() {
            return new ByteMatchSetByteMatchTupleFieldToMatchArgs(data, type);
        }
    }
}
