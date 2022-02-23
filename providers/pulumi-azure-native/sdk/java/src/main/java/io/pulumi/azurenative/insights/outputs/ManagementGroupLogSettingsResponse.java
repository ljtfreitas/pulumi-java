// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagementGroupLogSettingsResponse {
    /**
     * Name of a Management Group Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    private final String category;
    /**
     * a value indicating whether this log is enabled.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"category","enabled"})
    private ManagementGroupLogSettingsResponse(
        String category,
        Boolean enabled) {
        this.category = Objects.requireNonNull(category);
        this.enabled = Objects.requireNonNull(enabled);
    }

    /**
     * Name of a Management Group Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    public String getCategory() {
        return this.category;
    }
    /**
     * a value indicating whether this log is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupLogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupLogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCategory(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public ManagementGroupLogSettingsResponse build() {
            return new ManagementGroupLogSettingsResponse(category, enabled);
        }
    }
}
