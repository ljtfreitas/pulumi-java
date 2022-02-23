// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.wafv2.enums.WebACLScope;
import io.pulumi.awsnative.wafv2.inputs.WebACLCaptchaConfigArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLCustomResponseBodiesArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLDefaultActionArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLTagArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLVisibilityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLArgs Empty = new WebACLArgs();

    @InputImport(name="captchaConfig")
        private final @Nullable Input<WebACLCaptchaConfigArgs> captchaConfig;

    public Input<WebACLCaptchaConfigArgs> getCaptchaConfig() {
        return this.captchaConfig == null ? Input.empty() : this.captchaConfig;
    }

    @InputImport(name="customResponseBodies")
        private final @Nullable Input<WebACLCustomResponseBodiesArgs> customResponseBodies;

    public Input<WebACLCustomResponseBodiesArgs> getCustomResponseBodies() {
        return this.customResponseBodies == null ? Input.empty() : this.customResponseBodies;
    }

    @InputImport(name="defaultAction", required=true)
        private final Input<WebACLDefaultActionArgs> defaultAction;

    public Input<WebACLDefaultActionArgs> getDefaultAction() {
        return this.defaultAction;
    }

    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Collection of Rules.
     * 
     */
    @InputImport(name="rules")
        private final @Nullable Input<List<WebACLRuleArgs>> rules;

    public Input<List<WebACLRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    @InputImport(name="scope", required=true)
        private final Input<WebACLScope> scope;

    public Input<WebACLScope> getScope() {
        return this.scope;
    }

    @InputImport(name="tags")
        private final @Nullable Input<List<WebACLTagArgs>> tags;

    public Input<List<WebACLTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="visibilityConfig", required=true)
        private final Input<WebACLVisibilityConfigArgs> visibilityConfig;

    public Input<WebACLVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public WebACLArgs(
        @Nullable Input<WebACLCaptchaConfigArgs> captchaConfig,
        @Nullable Input<WebACLCustomResponseBodiesArgs> customResponseBodies,
        Input<WebACLDefaultActionArgs> defaultAction,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<WebACLRuleArgs>> rules,
        Input<WebACLScope> scope,
        @Nullable Input<List<WebACLTagArgs>> tags,
        Input<WebACLVisibilityConfigArgs> visibilityConfig) {
        this.captchaConfig = captchaConfig;
        this.customResponseBodies = customResponseBodies;
        this.defaultAction = Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.description = description;
        this.name = name;
        this.rules = rules;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebACLArgs() {
        this.captchaConfig = Input.empty();
        this.customResponseBodies = Input.empty();
        this.defaultAction = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.rules = Input.empty();
        this.scope = Input.empty();
        this.tags = Input.empty();
        this.visibilityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebACLCaptchaConfigArgs> captchaConfig;
        private @Nullable Input<WebACLCustomResponseBodiesArgs> customResponseBodies;
        private Input<WebACLDefaultActionArgs> defaultAction;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<WebACLRuleArgs>> rules;
        private Input<WebACLScope> scope;
        private @Nullable Input<List<WebACLTagArgs>> tags;
        private Input<WebACLVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.customResponseBodies = defaults.customResponseBodies;
    	      this.defaultAction = defaults.defaultAction;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setCaptchaConfig(@Nullable Input<WebACLCaptchaConfigArgs> captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }

        public Builder setCaptchaConfig(@Nullable WebACLCaptchaConfigArgs captchaConfig) {
            this.captchaConfig = Input.ofNullable(captchaConfig);
            return this;
        }

        public Builder setCustomResponseBodies(@Nullable Input<WebACLCustomResponseBodiesArgs> customResponseBodies) {
            this.customResponseBodies = customResponseBodies;
            return this;
        }

        public Builder setCustomResponseBodies(@Nullable WebACLCustomResponseBodiesArgs customResponseBodies) {
            this.customResponseBodies = Input.ofNullable(customResponseBodies);
            return this;
        }

        public Builder setDefaultAction(Input<WebACLDefaultActionArgs> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }

        public Builder setDefaultAction(WebACLDefaultActionArgs defaultAction) {
            this.defaultAction = Input.of(Objects.requireNonNull(defaultAction));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setRules(@Nullable Input<List<WebACLRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<WebACLRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setScope(Input<WebACLScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(WebACLScope scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setTags(@Nullable Input<List<WebACLTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<WebACLTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVisibilityConfig(Input<WebACLVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public Builder setVisibilityConfig(WebACLVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Input.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }
        public WebACLArgs build() {
            return new WebACLArgs(captchaConfig, customResponseBodies, defaultAction, description, name, rules, scope, tags, visibilityConfig);
        }
    }
}
