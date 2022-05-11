// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppSiteConfigAutoHealSettingAction {
    /**
     * @return The predefined action to be taken to an Auto Heal trigger.
     * 
     */
    private final String actionType;
    /**
     * @return The minimum amount of time in `hh:mm:ss` the Linux Web App must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    private final String minimumProcessExecutionTime;

    @CustomType.Constructor
    private GetLinuxWebAppSiteConfigAutoHealSettingAction(
        @CustomType.Parameter("actionType") String actionType,
        @CustomType.Parameter("minimumProcessExecutionTime") String minimumProcessExecutionTime) {
        this.actionType = actionType;
        this.minimumProcessExecutionTime = minimumProcessExecutionTime;
    }

    /**
     * @return The predefined action to be taken to an Auto Heal trigger.
     * 
     */
    public String actionType() {
        return this.actionType;
    }
    /**
     * @return The minimum amount of time in `hh:mm:ss` the Linux Web App must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    public String minimumProcessExecutionTime() {
        return this.minimumProcessExecutionTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppSiteConfigAutoHealSettingAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private String minimumProcessExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppSiteConfigAutoHealSettingAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.minimumProcessExecutionTime = defaults.minimumProcessExecutionTime;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder minimumProcessExecutionTime(String minimumProcessExecutionTime) {
            this.minimumProcessExecutionTime = Objects.requireNonNull(minimumProcessExecutionTime);
            return this;
        }        public GetLinuxWebAppSiteConfigAutoHealSettingAction build() {
            return new GetLinuxWebAppSiteConfigAutoHealSettingAction(actionType, minimumProcessExecutionTime);
        }
    }
}
