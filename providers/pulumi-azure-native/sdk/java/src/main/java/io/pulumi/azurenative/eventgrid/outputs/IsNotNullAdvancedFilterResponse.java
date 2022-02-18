// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IsNotNullAdvancedFilterResponse {
    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'IsNotNull'.
     * 
     */
    private final String operatorType;

    @OutputCustomType.Constructor({"key","operatorType"})
    private IsNotNullAdvancedFilterResponse(
        @Nullable String key,
        String operatorType) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType);
    }

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'IsNotNull'.
     * 
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IsNotNullAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;

        public Builder() {
    	      // Empty
        }

        public Builder(IsNotNullAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public IsNotNullAdvancedFilterResponse build() {
            return new IsNotNullAdvancedFilterResponse(key, operatorType);
        }
    }
}
