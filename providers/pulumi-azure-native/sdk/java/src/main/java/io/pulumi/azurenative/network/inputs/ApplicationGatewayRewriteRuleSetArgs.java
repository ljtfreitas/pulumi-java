// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rewrite rule set of an application gateway.
 * 
 */
public final class ApplicationGatewayRewriteRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRewriteRuleSetArgs Empty = new ApplicationGatewayRewriteRuleSetArgs();

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
     * Name of the rewrite rule set that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Rewrite rules in the rewrite rule set.
     * 
     */
    @InputImport(name="rewriteRules")
        private final @Nullable Input<List<ApplicationGatewayRewriteRuleArgs>> rewriteRules;

    public Input<List<ApplicationGatewayRewriteRuleArgs>> getRewriteRules() {
        return this.rewriteRules == null ? Input.empty() : this.rewriteRules;
    }

    public ApplicationGatewayRewriteRuleSetArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<ApplicationGatewayRewriteRuleArgs>> rewriteRules) {
        this.id = id;
        this.name = name;
        this.rewriteRules = rewriteRules;
    }

    private ApplicationGatewayRewriteRuleSetArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.rewriteRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ApplicationGatewayRewriteRuleArgs>> rewriteRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rewriteRules = defaults.rewriteRules;
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

        public Builder setRewriteRules(@Nullable Input<List<ApplicationGatewayRewriteRuleArgs>> rewriteRules) {
            this.rewriteRules = rewriteRules;
            return this;
        }

        public Builder setRewriteRules(@Nullable List<ApplicationGatewayRewriteRuleArgs> rewriteRules) {
            this.rewriteRules = Input.ofNullable(rewriteRules);
            return this;
        }
        public ApplicationGatewayRewriteRuleSetArgs build() {
            return new ApplicationGatewayRewriteRuleSetArgs(id, name, rewriteRules);
        }
    }
}
