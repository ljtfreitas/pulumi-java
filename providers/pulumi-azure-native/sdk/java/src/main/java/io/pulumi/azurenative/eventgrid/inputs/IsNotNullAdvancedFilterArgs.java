// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IsNotNull Advanced Filter.
 * 
 */
public final class IsNotNullAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final IsNotNullAdvancedFilterArgs Empty = new IsNotNullAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'IsNotNull'.
     * 
     */
    @Import(name="operatorType", required=true)
      private final Output<String> operatorType;

    public Output<String> getOperatorType() {
        return this.operatorType;
    }

    public IsNotNullAdvancedFilterArgs(
        @Nullable Output<String> key,
        Output<String> operatorType) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
    }

    private IsNotNullAdvancedFilterArgs() {
        this.key = Output.empty();
        this.operatorType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IsNotNullAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> operatorType;

        public Builder() {
    	      // Empty
        }

        public Builder(IsNotNullAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder operatorType(Output<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder operatorType(String operatorType) {
            this.operatorType = Output.of(Objects.requireNonNull(operatorType));
            return this;
        }
        public IsNotNullAdvancedFilterArgs build() {
            return new IsNotNullAdvancedFilterArgs(key, operatorType);
        }
    }
}
