// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayPathRuleArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * UrlPathMaps give a url path to the backend mapping information for PathBasedRouting.
 * 
 */
public final class ApplicationGatewayUrlPathMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayUrlPathMapArgs Empty = new ApplicationGatewayUrlPathMapArgs();

    /**
     * Default backend address pool resource of URL path map.
     * 
     */
    @InputImport(name="defaultBackendAddressPool")
        private final @Nullable Input<SubResourceArgs> defaultBackendAddressPool;

    public Input<SubResourceArgs> getDefaultBackendAddressPool() {
        return this.defaultBackendAddressPool == null ? Input.empty() : this.defaultBackendAddressPool;
    }

    /**
     * Default backend http settings resource of URL path map.
     * 
     */
    @InputImport(name="defaultBackendHttpSettings")
        private final @Nullable Input<SubResourceArgs> defaultBackendHttpSettings;

    public Input<SubResourceArgs> getDefaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings == null ? Input.empty() : this.defaultBackendHttpSettings;
    }

    /**
     * Default redirect configuration resource of URL path map.
     * 
     */
    @InputImport(name="defaultRedirectConfiguration")
        private final @Nullable Input<SubResourceArgs> defaultRedirectConfiguration;

    public Input<SubResourceArgs> getDefaultRedirectConfiguration() {
        return this.defaultRedirectConfiguration == null ? Input.empty() : this.defaultRedirectConfiguration;
    }

    /**
     * Default Rewrite rule set resource of URL path map.
     * 
     */
    @InputImport(name="defaultRewriteRuleSet")
        private final @Nullable Input<SubResourceArgs> defaultRewriteRuleSet;

    public Input<SubResourceArgs> getDefaultRewriteRuleSet() {
        return this.defaultRewriteRuleSet == null ? Input.empty() : this.defaultRewriteRuleSet;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the URL path map that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Path rule of URL path map resource.
     * 
     */
    @InputImport(name="pathRules")
        private final @Nullable Input<List<ApplicationGatewayPathRuleArgs>> pathRules;

    public Input<List<ApplicationGatewayPathRuleArgs>> getPathRules() {
        return this.pathRules == null ? Input.empty() : this.pathRules;
    }

    public ApplicationGatewayUrlPathMapArgs(
        @Nullable Input<SubResourceArgs> defaultBackendAddressPool,
        @Nullable Input<SubResourceArgs> defaultBackendHttpSettings,
        @Nullable Input<SubResourceArgs> defaultRedirectConfiguration,
        @Nullable Input<SubResourceArgs> defaultRewriteRuleSet,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<ApplicationGatewayPathRuleArgs>> pathRules) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        this.id = id;
        this.name = name;
        this.pathRules = pathRules;
    }

    private ApplicationGatewayUrlPathMapArgs() {
        this.defaultBackendAddressPool = Input.empty();
        this.defaultBackendHttpSettings = Input.empty();
        this.defaultRedirectConfiguration = Input.empty();
        this.defaultRewriteRuleSet = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.pathRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayUrlPathMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> defaultBackendAddressPool;
        private @Nullable Input<SubResourceArgs> defaultBackendHttpSettings;
        private @Nullable Input<SubResourceArgs> defaultRedirectConfiguration;
        private @Nullable Input<SubResourceArgs> defaultRewriteRuleSet;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ApplicationGatewayPathRuleArgs>> pathRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayUrlPathMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackendAddressPool = defaults.defaultBackendAddressPool;
    	      this.defaultBackendHttpSettings = defaults.defaultBackendHttpSettings;
    	      this.defaultRedirectConfiguration = defaults.defaultRedirectConfiguration;
    	      this.defaultRewriteRuleSet = defaults.defaultRewriteRuleSet;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
        }

        public Builder setDefaultBackendAddressPool(@Nullable Input<SubResourceArgs> defaultBackendAddressPool) {
            this.defaultBackendAddressPool = defaultBackendAddressPool;
            return this;
        }

        public Builder setDefaultBackendAddressPool(@Nullable SubResourceArgs defaultBackendAddressPool) {
            this.defaultBackendAddressPool = Input.ofNullable(defaultBackendAddressPool);
            return this;
        }

        public Builder setDefaultBackendHttpSettings(@Nullable Input<SubResourceArgs> defaultBackendHttpSettings) {
            this.defaultBackendHttpSettings = defaultBackendHttpSettings;
            return this;
        }

        public Builder setDefaultBackendHttpSettings(@Nullable SubResourceArgs defaultBackendHttpSettings) {
            this.defaultBackendHttpSettings = Input.ofNullable(defaultBackendHttpSettings);
            return this;
        }

        public Builder setDefaultRedirectConfiguration(@Nullable Input<SubResourceArgs> defaultRedirectConfiguration) {
            this.defaultRedirectConfiguration = defaultRedirectConfiguration;
            return this;
        }

        public Builder setDefaultRedirectConfiguration(@Nullable SubResourceArgs defaultRedirectConfiguration) {
            this.defaultRedirectConfiguration = Input.ofNullable(defaultRedirectConfiguration);
            return this;
        }

        public Builder setDefaultRewriteRuleSet(@Nullable Input<SubResourceArgs> defaultRewriteRuleSet) {
            this.defaultRewriteRuleSet = defaultRewriteRuleSet;
            return this;
        }

        public Builder setDefaultRewriteRuleSet(@Nullable SubResourceArgs defaultRewriteRuleSet) {
            this.defaultRewriteRuleSet = Input.ofNullable(defaultRewriteRuleSet);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPathRules(@Nullable Input<List<ApplicationGatewayPathRuleArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setPathRules(@Nullable List<ApplicationGatewayPathRuleArgs> pathRules) {
            this.pathRules = Input.ofNullable(pathRules);
            return this;
        }
        public ApplicationGatewayUrlPathMapArgs build() {
            return new ApplicationGatewayUrlPathMapArgs(defaultBackendAddressPool, defaultBackendHttpSettings, defaultRedirectConfiguration, defaultRewriteRuleSet, id, name, pathRules);
        }
    }
}
