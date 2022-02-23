// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ByteMatchSetByteMatchTupleFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetByteMatchTupleFieldToMatchGetArgs Empty = new ByteMatchSetByteMatchTupleFieldToMatchGetArgs();

    /**
     * When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
     */
    @InputImport(name="data")
    private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
     * for all supported values.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ByteMatchSetByteMatchTupleFieldToMatchGetArgs(
        @Nullable Input<String> data,
        Input<String> type) {
        this.data = data;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ByteMatchSetByteMatchTupleFieldToMatchGetArgs() {
        this.data = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTupleFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> data;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTupleFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder setData(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = Input.ofNullable(data);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ByteMatchSetByteMatchTupleFieldToMatchGetArgs build() {
            return new ByteMatchSetByteMatchTupleFieldToMatchGetArgs(data, type);
        }
    }
}
