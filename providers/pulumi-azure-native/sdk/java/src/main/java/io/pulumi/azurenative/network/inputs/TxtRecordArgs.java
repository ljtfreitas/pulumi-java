// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A TXT record.
 * 
 */
public final class TxtRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final TxtRecordArgs Empty = new TxtRecordArgs();

    /**
     * The text value of this TXT record.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<List<String>> value;

    public Output<List<String>> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public TxtRecordArgs(@Nullable Output<List<String>> value) {
        this.value = value;
    }

    private TxtRecordArgs() {
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TxtRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TxtRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable Output<List<String>> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable List<String> value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public TxtRecordArgs build() {
            return new TxtRecordArgs(value);
        }
    }
}
