// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSalesforceSourceProperties {
    private final @Nullable Boolean enableDynamicFieldUpdate;
    private final @Nullable Boolean includeDeletedRecords;
    private final String object;

    @OutputCustomType.Constructor({"enableDynamicFieldUpdate","includeDeletedRecords","object"})
    private FlowSalesforceSourceProperties(
        @Nullable Boolean enableDynamicFieldUpdate,
        @Nullable Boolean includeDeletedRecords,
        String object) {
        this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
        this.includeDeletedRecords = includeDeletedRecords;
        this.object = Objects.requireNonNull(object);
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

    public static Builder builder(FlowSalesforceSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDynamicFieldUpdate;
        private @Nullable Boolean includeDeletedRecords;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSalesforceSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicFieldUpdate = defaults.enableDynamicFieldUpdate;
    	      this.includeDeletedRecords = defaults.includeDeletedRecords;
    	      this.object = defaults.object;
        }

        public Builder setEnableDynamicFieldUpdate(@Nullable Boolean enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
            return this;
        }

        public Builder setIncludeDeletedRecords(@Nullable Boolean includeDeletedRecords) {
            this.includeDeletedRecords = includeDeletedRecords;
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowSalesforceSourceProperties build() {
            return new FlowSalesforceSourceProperties(enableDynamicFieldUpdate, includeDeletedRecords, object);
        }
    }
}
