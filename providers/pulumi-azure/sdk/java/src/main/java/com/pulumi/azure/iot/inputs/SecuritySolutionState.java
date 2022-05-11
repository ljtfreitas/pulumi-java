// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs;
import com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecuritySolutionState extends com.pulumi.resources.ResourceArgs {

    public static final SecuritySolutionState Empty = new SecuritySolutionState();

    /**
     * A `additional_workspace` block as defined below.
     * 
     */
    @Import(name="additionalWorkspaces")
    private @Nullable Output<List<SecuritySolutionAdditionalWorkspaceArgs>> additionalWorkspaces;

    /**
     * @return A `additional_workspace` block as defined below.
     * 
     */
    public Optional<Output<List<SecuritySolutionAdditionalWorkspaceArgs>>> additionalWorkspaces() {
        return Optional.ofNullable(this.additionalWorkspaces);
    }

    /**
     * A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
     * 
     */
    @Import(name="disabledDataSources")
    private @Nullable Output<List<String>> disabledDataSources;

    /**
     * @return A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
     * 
     */
    public Optional<Output<List<String>>> disabledDataSources() {
        return Optional.ofNullable(this.disabledDataSources);
    }

    /**
     * Specifies the Display Name for this Iot Security Solution.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the Display Name for this Iot Security Solution.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Is the Iot Security Solution enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the Iot Security Solution enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
     * 
     */
    @Import(name="eventsToExports")
    private @Nullable Output<List<String>> eventsToExports;

    /**
     * @return A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
     * 
     */
    public Optional<Output<List<String>>> eventsToExports() {
        return Optional.ofNullable(this.eventsToExports);
    }

    /**
     * Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
     * 
     */
    @Import(name="iothubIds")
    private @Nullable Output<List<String>> iothubIds;

    /**
     * @return Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
     * 
     */
    public Optional<Output<List<String>>> iothubIds() {
        return Optional.ofNullable(this.iothubIds);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the Log Analytics Workspace ID to which the security data will be sent.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId")
    private @Nullable Output<String> logAnalyticsWorkspaceId;

    /**
     * @return Specifies the Log Analytics Workspace ID to which the security data will be sent.
     * 
     */
    public Optional<Output<String>> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    /**
     * Should IP addressed be unmasked in the log? Defaults to `false`.
     * 
     */
    @Import(name="logUnmaskedIpsEnabled")
    private @Nullable Output<Boolean> logUnmaskedIpsEnabled;

    /**
     * @return Should IP addressed be unmasked in the log? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> logUnmaskedIpsEnabled() {
        return Optional.ofNullable(this.logUnmaskedIpsEnabled);
    }

    /**
     * Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An Azure Resource Graph query used to set the resources monitored.
     * 
     */
    @Import(name="queryForResources")
    private @Nullable Output<String> queryForResources;

    /**
     * @return An Azure Resource Graph query used to set the resources monitored.
     * 
     */
    public Optional<Output<String>> queryForResources() {
        return Optional.ofNullable(this.queryForResources);
    }

    /**
     * A list of subscription Ids on which the user defined resources query should be executed.
     * 
     */
    @Import(name="querySubscriptionIds")
    private @Nullable Output<List<String>> querySubscriptionIds;

    /**
     * @return A list of subscription Ids on which the user defined resources query should be executed.
     * 
     */
    public Optional<Output<List<String>>> querySubscriptionIds() {
        return Optional.ofNullable(this.querySubscriptionIds);
    }

    /**
     * A `recommendations_enabled` block of options to enable or disable as defined below.
     * 
     */
    @Import(name="recommendationsEnabled")
    private @Nullable Output<SecuritySolutionRecommendationsEnabledArgs> recommendationsEnabled;

    /**
     * @return A `recommendations_enabled` block of options to enable or disable as defined below.
     * 
     */
    public Optional<Output<SecuritySolutionRecommendationsEnabledArgs>> recommendationsEnabled() {
        return Optional.ofNullable(this.recommendationsEnabled);
    }

    /**
     * Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SecuritySolutionState() {}

    private SecuritySolutionState(SecuritySolutionState $) {
        this.additionalWorkspaces = $.additionalWorkspaces;
        this.disabledDataSources = $.disabledDataSources;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.eventsToExports = $.eventsToExports;
        this.iothubIds = $.iothubIds;
        this.location = $.location;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.logUnmaskedIpsEnabled = $.logUnmaskedIpsEnabled;
        this.name = $.name;
        this.queryForResources = $.queryForResources;
        this.querySubscriptionIds = $.querySubscriptionIds;
        this.recommendationsEnabled = $.recommendationsEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecuritySolutionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecuritySolutionState $;

        public Builder() {
            $ = new SecuritySolutionState();
        }

        public Builder(SecuritySolutionState defaults) {
            $ = new SecuritySolutionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalWorkspaces A `additional_workspace` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalWorkspaces(@Nullable Output<List<SecuritySolutionAdditionalWorkspaceArgs>> additionalWorkspaces) {
            $.additionalWorkspaces = additionalWorkspaces;
            return this;
        }

        /**
         * @param additionalWorkspaces A `additional_workspace` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalWorkspaces(List<SecuritySolutionAdditionalWorkspaceArgs> additionalWorkspaces) {
            return additionalWorkspaces(Output.of(additionalWorkspaces));
        }

        /**
         * @param additionalWorkspaces A `additional_workspace` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalWorkspaces(SecuritySolutionAdditionalWorkspaceArgs... additionalWorkspaces) {
            return additionalWorkspaces(List.of(additionalWorkspaces));
        }

        /**
         * @param disabledDataSources A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
         * 
         * @return builder
         * 
         */
        public Builder disabledDataSources(@Nullable Output<List<String>> disabledDataSources) {
            $.disabledDataSources = disabledDataSources;
            return this;
        }

        /**
         * @param disabledDataSources A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
         * 
         * @return builder
         * 
         */
        public Builder disabledDataSources(List<String> disabledDataSources) {
            return disabledDataSources(Output.of(disabledDataSources));
        }

        /**
         * @param disabledDataSources A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
         * 
         * @return builder
         * 
         */
        public Builder disabledDataSources(String... disabledDataSources) {
            return disabledDataSources(List.of(disabledDataSources));
        }

        /**
         * @param displayName Specifies the Display Name for this Iot Security Solution.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the Display Name for this Iot Security Solution.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Is the Iot Security Solution enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the Iot Security Solution enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param eventsToExports A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
         * 
         * @return builder
         * 
         */
        public Builder eventsToExports(@Nullable Output<List<String>> eventsToExports) {
            $.eventsToExports = eventsToExports;
            return this;
        }

        /**
         * @param eventsToExports A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
         * 
         * @return builder
         * 
         */
        public Builder eventsToExports(List<String> eventsToExports) {
            return eventsToExports(Output.of(eventsToExports));
        }

        /**
         * @param eventsToExports A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
         * 
         * @return builder
         * 
         */
        public Builder eventsToExports(String... eventsToExports) {
            return eventsToExports(List.of(eventsToExports));
        }

        /**
         * @param iothubIds Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
         * 
         * @return builder
         * 
         */
        public Builder iothubIds(@Nullable Output<List<String>> iothubIds) {
            $.iothubIds = iothubIds;
            return this;
        }

        /**
         * @param iothubIds Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
         * 
         * @return builder
         * 
         */
        public Builder iothubIds(List<String> iothubIds) {
            return iothubIds(Output.of(iothubIds));
        }

        /**
         * @param iothubIds Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
         * 
         * @return builder
         * 
         */
        public Builder iothubIds(String... iothubIds) {
            return iothubIds(List.of(iothubIds));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logAnalyticsWorkspaceId Specifies the Log Analytics Workspace ID to which the security data will be sent.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(@Nullable Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId Specifies the Log Analytics Workspace ID to which the security data will be sent.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param logUnmaskedIpsEnabled Should IP addressed be unmasked in the log? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder logUnmaskedIpsEnabled(@Nullable Output<Boolean> logUnmaskedIpsEnabled) {
            $.logUnmaskedIpsEnabled = logUnmaskedIpsEnabled;
            return this;
        }

        /**
         * @param logUnmaskedIpsEnabled Should IP addressed be unmasked in the log? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder logUnmaskedIpsEnabled(Boolean logUnmaskedIpsEnabled) {
            return logUnmaskedIpsEnabled(Output.of(logUnmaskedIpsEnabled));
        }

        /**
         * @param name Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queryForResources An Azure Resource Graph query used to set the resources monitored.
         * 
         * @return builder
         * 
         */
        public Builder queryForResources(@Nullable Output<String> queryForResources) {
            $.queryForResources = queryForResources;
            return this;
        }

        /**
         * @param queryForResources An Azure Resource Graph query used to set the resources monitored.
         * 
         * @return builder
         * 
         */
        public Builder queryForResources(String queryForResources) {
            return queryForResources(Output.of(queryForResources));
        }

        /**
         * @param querySubscriptionIds A list of subscription Ids on which the user defined resources query should be executed.
         * 
         * @return builder
         * 
         */
        public Builder querySubscriptionIds(@Nullable Output<List<String>> querySubscriptionIds) {
            $.querySubscriptionIds = querySubscriptionIds;
            return this;
        }

        /**
         * @param querySubscriptionIds A list of subscription Ids on which the user defined resources query should be executed.
         * 
         * @return builder
         * 
         */
        public Builder querySubscriptionIds(List<String> querySubscriptionIds) {
            return querySubscriptionIds(Output.of(querySubscriptionIds));
        }

        /**
         * @param querySubscriptionIds A list of subscription Ids on which the user defined resources query should be executed.
         * 
         * @return builder
         * 
         */
        public Builder querySubscriptionIds(String... querySubscriptionIds) {
            return querySubscriptionIds(List.of(querySubscriptionIds));
        }

        /**
         * @param recommendationsEnabled A `recommendations_enabled` block of options to enable or disable as defined below.
         * 
         * @return builder
         * 
         */
        public Builder recommendationsEnabled(@Nullable Output<SecuritySolutionRecommendationsEnabledArgs> recommendationsEnabled) {
            $.recommendationsEnabled = recommendationsEnabled;
            return this;
        }

        /**
         * @param recommendationsEnabled A `recommendations_enabled` block of options to enable or disable as defined below.
         * 
         * @return builder
         * 
         */
        public Builder recommendationsEnabled(SecuritySolutionRecommendationsEnabledArgs recommendationsEnabled) {
            return recommendationsEnabled(Output.of(recommendationsEnabled));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SecuritySolutionState build() {
            return $;
        }
    }

}
