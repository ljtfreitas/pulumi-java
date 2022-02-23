// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DashboardSourceTemplate;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardSourceEntity {
    private final @Nullable DashboardSourceTemplate sourceTemplate;

    @OutputCustomType.Constructor({"sourceTemplate"})
    private DashboardSourceEntity(@Nullable DashboardSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
    }

    public Optional<DashboardSourceTemplate> getSourceTemplate() {
        return Optional.ofNullable(this.sourceTemplate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSourceEntity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DashboardSourceTemplate sourceTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardSourceEntity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceTemplate = defaults.sourceTemplate;
        }

        public Builder setSourceTemplate(@Nullable DashboardSourceTemplate sourceTemplate) {
            this.sourceTemplate = sourceTemplate;
            return this;
        }
        public DashboardSourceEntity build() {
            return new DashboardSourceEntity(sourceTemplate);
        }
    }
}
