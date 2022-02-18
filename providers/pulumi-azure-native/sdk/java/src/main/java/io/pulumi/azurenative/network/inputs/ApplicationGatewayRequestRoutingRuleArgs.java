// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayRequestRoutingRuleType;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Request routing rule of an application gateway.
 * 
 */
public final class ApplicationGatewayRequestRoutingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRequestRoutingRuleArgs Empty = new ApplicationGatewayRequestRoutingRuleArgs();

    /**
     * Backend address pool resource of the application gateway.
     * 
     */
    @InputImport(name="backendAddressPool")
    private final @Nullable Input<SubResourceArgs> backendAddressPool;

    public Input<SubResourceArgs> getBackendAddressPool() {
        return this.backendAddressPool == null ? Input.empty() : this.backendAddressPool;
    }

    /**
     * Backend http settings resource of the application gateway.
     * 
     */
    @InputImport(name="backendHttpSettings")
    private final @Nullable Input<SubResourceArgs> backendHttpSettings;

    public Input<SubResourceArgs> getBackendHttpSettings() {
        return this.backendHttpSettings == null ? Input.empty() : this.backendHttpSettings;
    }

    /**
     * Http listener resource of the application gateway.
     * 
     */
    @InputImport(name="httpListener")
    private final @Nullable Input<SubResourceArgs> httpListener;

    public Input<SubResourceArgs> getHttpListener() {
        return this.httpListener == null ? Input.empty() : this.httpListener;
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
     * Name of the request routing rule that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of the request routing rule.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Redirect configuration resource of the application gateway.
     * 
     */
    @InputImport(name="redirectConfiguration")
    private final @Nullable Input<SubResourceArgs> redirectConfiguration;

    public Input<SubResourceArgs> getRedirectConfiguration() {
        return this.redirectConfiguration == null ? Input.empty() : this.redirectConfiguration;
    }

    /**
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
     */
    @InputImport(name="rewriteRuleSet")
    private final @Nullable Input<SubResourceArgs> rewriteRuleSet;

    public Input<SubResourceArgs> getRewriteRuleSet() {
        return this.rewriteRuleSet == null ? Input.empty() : this.rewriteRuleSet;
    }

    /**
     * Rule type.
     * 
     */
    @InputImport(name="ruleType")
    private final @Nullable Input<Either<String,ApplicationGatewayRequestRoutingRuleType>> ruleType;

    public Input<Either<String,ApplicationGatewayRequestRoutingRuleType>> getRuleType() {
        return this.ruleType == null ? Input.empty() : this.ruleType;
    }

    /**
     * URL path map resource of the application gateway.
     * 
     */
    @InputImport(name="urlPathMap")
    private final @Nullable Input<SubResourceArgs> urlPathMap;

    public Input<SubResourceArgs> getUrlPathMap() {
        return this.urlPathMap == null ? Input.empty() : this.urlPathMap;
    }

    public ApplicationGatewayRequestRoutingRuleArgs(
        @Nullable Input<SubResourceArgs> backendAddressPool,
        @Nullable Input<SubResourceArgs> backendHttpSettings,
        @Nullable Input<SubResourceArgs> httpListener,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        @Nullable Input<SubResourceArgs> redirectConfiguration,
        @Nullable Input<SubResourceArgs> rewriteRuleSet,
        @Nullable Input<Either<String,ApplicationGatewayRequestRoutingRuleType>> ruleType,
        @Nullable Input<SubResourceArgs> urlPathMap) {
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.httpListener = httpListener;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.redirectConfiguration = redirectConfiguration;
        this.rewriteRuleSet = rewriteRuleSet;
        this.ruleType = ruleType;
        this.urlPathMap = urlPathMap;
    }

    private ApplicationGatewayRequestRoutingRuleArgs() {
        this.backendAddressPool = Input.empty();
        this.backendHttpSettings = Input.empty();
        this.httpListener = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.redirectConfiguration = Input.empty();
        this.rewriteRuleSet = Input.empty();
        this.ruleType = Input.empty();
        this.urlPathMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRequestRoutingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> backendAddressPool;
        private @Nullable Input<SubResourceArgs> backendHttpSettings;
        private @Nullable Input<SubResourceArgs> httpListener;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<SubResourceArgs> redirectConfiguration;
        private @Nullable Input<SubResourceArgs> rewriteRuleSet;
        private @Nullable Input<Either<String,ApplicationGatewayRequestRoutingRuleType>> ruleType;
        private @Nullable Input<SubResourceArgs> urlPathMap;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRequestRoutingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.httpListener = defaults.httpListener;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.redirectConfiguration = defaults.redirectConfiguration;
    	      this.rewriteRuleSet = defaults.rewriteRuleSet;
    	      this.ruleType = defaults.ruleType;
    	      this.urlPathMap = defaults.urlPathMap;
        }

        public Builder setBackendAddressPool(@Nullable Input<SubResourceArgs> backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder setBackendAddressPool(@Nullable SubResourceArgs backendAddressPool) {
            this.backendAddressPool = Input.ofNullable(backendAddressPool);
            return this;
        }

        public Builder setBackendHttpSettings(@Nullable Input<SubResourceArgs> backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }

        public Builder setBackendHttpSettings(@Nullable SubResourceArgs backendHttpSettings) {
            this.backendHttpSettings = Input.ofNullable(backendHttpSettings);
            return this;
        }

        public Builder setHttpListener(@Nullable Input<SubResourceArgs> httpListener) {
            this.httpListener = httpListener;
            return this;
        }

        public Builder setHttpListener(@Nullable SubResourceArgs httpListener) {
            this.httpListener = Input.ofNullable(httpListener);
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

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setRedirectConfiguration(@Nullable Input<SubResourceArgs> redirectConfiguration) {
            this.redirectConfiguration = redirectConfiguration;
            return this;
        }

        public Builder setRedirectConfiguration(@Nullable SubResourceArgs redirectConfiguration) {
            this.redirectConfiguration = Input.ofNullable(redirectConfiguration);
            return this;
        }

        public Builder setRewriteRuleSet(@Nullable Input<SubResourceArgs> rewriteRuleSet) {
            this.rewriteRuleSet = rewriteRuleSet;
            return this;
        }

        public Builder setRewriteRuleSet(@Nullable SubResourceArgs rewriteRuleSet) {
            this.rewriteRuleSet = Input.ofNullable(rewriteRuleSet);
            return this;
        }

        public Builder setRuleType(@Nullable Input<Either<String,ApplicationGatewayRequestRoutingRuleType>> ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public Builder setRuleType(@Nullable Either<String,ApplicationGatewayRequestRoutingRuleType> ruleType) {
            this.ruleType = Input.ofNullable(ruleType);
            return this;
        }

        public Builder setUrlPathMap(@Nullable Input<SubResourceArgs> urlPathMap) {
            this.urlPathMap = urlPathMap;
            return this;
        }

        public Builder setUrlPathMap(@Nullable SubResourceArgs urlPathMap) {
            this.urlPathMap = Input.ofNullable(urlPathMap);
            return this;
        }

        public ApplicationGatewayRequestRoutingRuleArgs build() {
            return new ApplicationGatewayRequestRoutingRuleArgs(backendAddressPool, backendHttpSettings, httpListener, id, name, priority, redirectConfiguration, rewriteRuleSet, ruleType, urlPathMap);
        }
    }
}
