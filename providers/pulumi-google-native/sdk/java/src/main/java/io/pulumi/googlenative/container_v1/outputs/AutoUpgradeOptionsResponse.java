// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AutoUpgradeOptionsResponse {
    /**
     * [Output only] This field is set when upgrades are about to commence with the approximate start time for the upgrades, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    private final String autoUpgradeStartTime;
    /**
     * [Output only] This field is set when upgrades are about to commence with the description of the upgrade.
     * 
     */
    private final String description;

    @OutputCustomType.Constructor({"autoUpgradeStartTime","description"})
    private AutoUpgradeOptionsResponse(
        String autoUpgradeStartTime,
        String description) {
        this.autoUpgradeStartTime = Objects.requireNonNull(autoUpgradeStartTime);
        this.description = Objects.requireNonNull(description);
    }

    /**
     * [Output only] This field is set when upgrades are about to commence with the approximate start time for the upgrades, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    public String getAutoUpgradeStartTime() {
        return this.autoUpgradeStartTime;
    }
    /**
     * [Output only] This field is set when upgrades are about to commence with the description of the upgrade.
     * 
     */
    public String getDescription() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoUpgradeOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoUpgradeStartTime;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoUpgradeOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeStartTime = defaults.autoUpgradeStartTime;
    	      this.description = defaults.description;
        }

        public Builder setAutoUpgradeStartTime(String autoUpgradeStartTime) {
            this.autoUpgradeStartTime = Objects.requireNonNull(autoUpgradeStartTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public AutoUpgradeOptionsResponse build() {
            return new AutoUpgradeOptionsResponse(autoUpgradeStartTime, description);
        }
    }
}
