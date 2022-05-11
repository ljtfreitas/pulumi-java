// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.trafficmanager.inputs;

import com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs;
import com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProfileState extends com.pulumi.resources.ResourceArgs {

    public static final ProfileState Empty = new ProfileState();

    /**
     * This block specifies the DNS configuration of the Profile, it supports the fields documented below.
     * 
     */
    @Import(name="dnsConfig")
    private @Nullable Output<ProfileDnsConfigArgs> dnsConfig;

    /**
     * @return This block specifies the DNS configuration of the Profile, it supports the fields documented below.
     * 
     */
    public Optional<Output<ProfileDnsConfigArgs>> dnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }

    /**
     * The FQDN of the created Profile.
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return The FQDN of the created Profile.
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    /**
     * The amount of endpoints to return for DNS queries to this Profile. Possible values range from `1` to `8`.
     * 
     */
    @Import(name="maxReturn")
    private @Nullable Output<Integer> maxReturn;

    /**
     * @return The amount of endpoints to return for DNS queries to this Profile. Possible values range from `1` to `8`.
     * 
     */
    public Optional<Output<Integer>> maxReturn() {
        return Optional.ofNullable(this.maxReturn);
    }

    /**
     * This block specifies the Endpoint monitoring configuration for the Profile, it supports the fields documented below.
     * 
     */
    @Import(name="monitorConfig")
    private @Nullable Output<ProfileMonitorConfigArgs> monitorConfig;

    /**
     * @return This block specifies the Endpoint monitoring configuration for the Profile, it supports the fields documented below.
     * 
     */
    public Optional<Output<ProfileMonitorConfigArgs>> monitorConfig() {
        return Optional.ofNullable(this.monitorConfig);
    }

    /**
     * The name of the Traffic Manager profile. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Traffic Manager profile. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The status of the profile, can be set to either `Enabled` or `Disabled`. Defaults to `Enabled`.
     * 
     */
    @Import(name="profileStatus")
    private @Nullable Output<String> profileStatus;

    /**
     * @return The status of the profile, can be set to either `Enabled` or `Disabled`. Defaults to `Enabled`.
     * 
     */
    public Optional<Output<String>> profileStatus() {
        return Optional.ofNullable(this.profileStatus);
    }

    /**
     * The name of the resource group in which to create the Traffic Manager profile.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Traffic Manager profile.
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

    /**
     * Specifies the algorithm used to route traffic, possible values are:
     * 
     */
    @Import(name="trafficRoutingMethod")
    private @Nullable Output<String> trafficRoutingMethod;

    /**
     * @return Specifies the algorithm used to route traffic, possible values are:
     * 
     */
    public Optional<Output<String>> trafficRoutingMethod() {
        return Optional.ofNullable(this.trafficRoutingMethod);
    }

    /**
     * Indicates whether Traffic View is enabled for the Traffic Manager profile.
     * 
     */
    @Import(name="trafficViewEnabled")
    private @Nullable Output<Boolean> trafficViewEnabled;

    /**
     * @return Indicates whether Traffic View is enabled for the Traffic Manager profile.
     * 
     */
    public Optional<Output<Boolean>> trafficViewEnabled() {
        return Optional.ofNullable(this.trafficViewEnabled);
    }

    private ProfileState() {}

    private ProfileState(ProfileState $) {
        this.dnsConfig = $.dnsConfig;
        this.fqdn = $.fqdn;
        this.maxReturn = $.maxReturn;
        this.monitorConfig = $.monitorConfig;
        this.name = $.name;
        this.profileStatus = $.profileStatus;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.trafficRoutingMethod = $.trafficRoutingMethod;
        this.trafficViewEnabled = $.trafficViewEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProfileState $;

        public Builder() {
            $ = new ProfileState();
        }

        public Builder(ProfileState defaults) {
            $ = new ProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsConfig This block specifies the DNS configuration of the Profile, it supports the fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder dnsConfig(@Nullable Output<ProfileDnsConfigArgs> dnsConfig) {
            $.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * @param dnsConfig This block specifies the DNS configuration of the Profile, it supports the fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder dnsConfig(ProfileDnsConfigArgs dnsConfig) {
            return dnsConfig(Output.of(dnsConfig));
        }

        /**
         * @param fqdn The FQDN of the created Profile.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn The FQDN of the created Profile.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        /**
         * @param maxReturn The amount of endpoints to return for DNS queries to this Profile. Possible values range from `1` to `8`.
         * 
         * @return builder
         * 
         */
        public Builder maxReturn(@Nullable Output<Integer> maxReturn) {
            $.maxReturn = maxReturn;
            return this;
        }

        /**
         * @param maxReturn The amount of endpoints to return for DNS queries to this Profile. Possible values range from `1` to `8`.
         * 
         * @return builder
         * 
         */
        public Builder maxReturn(Integer maxReturn) {
            return maxReturn(Output.of(maxReturn));
        }

        /**
         * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile, it supports the fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder monitorConfig(@Nullable Output<ProfileMonitorConfigArgs> monitorConfig) {
            $.monitorConfig = monitorConfig;
            return this;
        }

        /**
         * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile, it supports the fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder monitorConfig(ProfileMonitorConfigArgs monitorConfig) {
            return monitorConfig(Output.of(monitorConfig));
        }

        /**
         * @param name The name of the Traffic Manager profile. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Traffic Manager profile. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param profileStatus The status of the profile, can be set to either `Enabled` or `Disabled`. Defaults to `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder profileStatus(@Nullable Output<String> profileStatus) {
            $.profileStatus = profileStatus;
            return this;
        }

        /**
         * @param profileStatus The status of the profile, can be set to either `Enabled` or `Disabled`. Defaults to `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder profileStatus(String profileStatus) {
            return profileStatus(Output.of(profileStatus));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Traffic Manager profile.
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

        /**
         * @param trafficRoutingMethod Specifies the algorithm used to route traffic, possible values are:
         * 
         * @return builder
         * 
         */
        public Builder trafficRoutingMethod(@Nullable Output<String> trafficRoutingMethod) {
            $.trafficRoutingMethod = trafficRoutingMethod;
            return this;
        }

        /**
         * @param trafficRoutingMethod Specifies the algorithm used to route traffic, possible values are:
         * 
         * @return builder
         * 
         */
        public Builder trafficRoutingMethod(String trafficRoutingMethod) {
            return trafficRoutingMethod(Output.of(trafficRoutingMethod));
        }

        /**
         * @param trafficViewEnabled Indicates whether Traffic View is enabled for the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder trafficViewEnabled(@Nullable Output<Boolean> trafficViewEnabled) {
            $.trafficViewEnabled = trafficViewEnabled;
            return this;
        }

        /**
         * @param trafficViewEnabled Indicates whether Traffic View is enabled for the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder trafficViewEnabled(Boolean trafficViewEnabled) {
            return trafficViewEnabled(Output.of(trafficViewEnabled));
        }

        public ProfileState build() {
            return $;
        }
    }

}
