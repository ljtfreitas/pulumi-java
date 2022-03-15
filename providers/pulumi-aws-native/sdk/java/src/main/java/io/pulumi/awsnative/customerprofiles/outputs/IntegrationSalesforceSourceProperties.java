// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationSalesforceSourceProperties {
    private final @Nullable Boolean enableDynamicFieldUpdate;
    private final @Nullable Boolean includeDeletedRecords;
    private final String object;

    @CustomType.Constructor
    private IntegrationSalesforceSourceProperties(
        @CustomType.Parameter("enableDynamicFieldUpdate") @Nullable Boolean enableDynamicFieldUpdate,
        @CustomType.Parameter("includeDeletedRecords") @Nullable Boolean includeDeletedRecords,
        @CustomType.Parameter("object") String object) {
        this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
        this.includeDeletedRecords = includeDeletedRecords;
        this.object = object;
    }

    public Optional<Boolean> getEnableDynamicFieldUpdate() {
        return Optional.ofNullable(this.enableDynamicFieldUpdate);
    }
    public Optional<Boolean> getIncludeDeletedRecords() {
        return Optional.ofNullable(this.includeDeletedRecords);
    }
    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationSalesforceSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDynamicFieldUpdate;
        private @Nullable Boolean includeDeletedRecords;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationSalesforceSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicFieldUpdate = defaults.enableDynamicFieldUpdate;
    	      this.includeDeletedRecords = defaults.includeDeletedRecords;
    	      this.object = defaults.object;
        }

        public Builder enableDynamicFieldUpdate(@Nullable Boolean enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
            return this;
        }

        public Builder includeDeletedRecords(@Nullable Boolean includeDeletedRecords) {
            this.includeDeletedRecords = includeDeletedRecords;
            return this;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public IntegrationSalesforceSourceProperties build() {
            return new IntegrationSalesforceSourceProperties(enableDynamicFieldUpdate, includeDeletedRecords, object);
        }
    }
}
