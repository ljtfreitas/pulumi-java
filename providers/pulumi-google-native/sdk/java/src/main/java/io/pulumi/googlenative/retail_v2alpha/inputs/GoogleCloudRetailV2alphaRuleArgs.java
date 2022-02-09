// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaConditionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleBoostActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleFilterActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleIgnoreActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleRedirectActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleReplacementActionArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRetailV2alphaRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleArgs Empty = new GoogleCloudRetailV2alphaRuleArgs();

    @InputImport(name="boostAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleBoostActionArgs> boostAction;

    public Input<GoogleCloudRetailV2alphaRuleBoostActionArgs> getBoostAction() {
        return this.boostAction == null ? Input.empty() : this.boostAction;
    }

    @InputImport(name="condition", required=true)
    private final Input<GoogleCloudRetailV2alphaConditionArgs> condition;

    public Input<GoogleCloudRetailV2alphaConditionArgs> getCondition() {
        return this.condition;
    }

    @InputImport(name="doNotAssociateAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> doNotAssociateAction;

    public Input<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> getDoNotAssociateAction() {
        return this.doNotAssociateAction == null ? Input.empty() : this.doNotAssociateAction;
    }

    @InputImport(name="filterAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleFilterActionArgs> filterAction;

    public Input<GoogleCloudRetailV2alphaRuleFilterActionArgs> getFilterAction() {
        return this.filterAction == null ? Input.empty() : this.filterAction;
    }

    @InputImport(name="ignoreAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> ignoreAction;

    public Input<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> getIgnoreAction() {
        return this.ignoreAction == null ? Input.empty() : this.ignoreAction;
    }

    @InputImport(name="onewaySynonymsAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> onewaySynonymsAction;

    public Input<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> getOnewaySynonymsAction() {
        return this.onewaySynonymsAction == null ? Input.empty() : this.onewaySynonymsAction;
    }

    @InputImport(name="redirectAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleRedirectActionArgs> redirectAction;

    public Input<GoogleCloudRetailV2alphaRuleRedirectActionArgs> getRedirectAction() {
        return this.redirectAction == null ? Input.empty() : this.redirectAction;
    }

    @InputImport(name="replacementAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleReplacementActionArgs> replacementAction;

    public Input<GoogleCloudRetailV2alphaRuleReplacementActionArgs> getReplacementAction() {
        return this.replacementAction == null ? Input.empty() : this.replacementAction;
    }

    @InputImport(name="twowaySynonymsAction")
    private final @Nullable Input<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> twowaySynonymsAction;

    public Input<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> getTwowaySynonymsAction() {
        return this.twowaySynonymsAction == null ? Input.empty() : this.twowaySynonymsAction;
    }

    public GoogleCloudRetailV2alphaRuleArgs(
        @Nullable Input<GoogleCloudRetailV2alphaRuleBoostActionArgs> boostAction,
        Input<GoogleCloudRetailV2alphaConditionArgs> condition,
        @Nullable Input<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> doNotAssociateAction,
        @Nullable Input<GoogleCloudRetailV2alphaRuleFilterActionArgs> filterAction,
        @Nullable Input<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> ignoreAction,
        @Nullable Input<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> onewaySynonymsAction,
        @Nullable Input<GoogleCloudRetailV2alphaRuleRedirectActionArgs> redirectAction,
        @Nullable Input<GoogleCloudRetailV2alphaRuleReplacementActionArgs> replacementAction,
        @Nullable Input<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> twowaySynonymsAction) {
        this.boostAction = boostAction;
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.doNotAssociateAction = doNotAssociateAction;
        this.filterAction = filterAction;
        this.ignoreAction = ignoreAction;
        this.onewaySynonymsAction = onewaySynonymsAction;
        this.redirectAction = redirectAction;
        this.replacementAction = replacementAction;
        this.twowaySynonymsAction = twowaySynonymsAction;
    }

    private GoogleCloudRetailV2alphaRuleArgs() {
        this.boostAction = Input.empty();
        this.condition = Input.empty();
        this.doNotAssociateAction = Input.empty();
        this.filterAction = Input.empty();
        this.ignoreAction = Input.empty();
        this.onewaySynonymsAction = Input.empty();
        this.redirectAction = Input.empty();
        this.replacementAction = Input.empty();
        this.twowaySynonymsAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudRetailV2alphaRuleBoostActionArgs> boostAction;
        private Input<GoogleCloudRetailV2alphaConditionArgs> condition;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> doNotAssociateAction;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleFilterActionArgs> filterAction;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> ignoreAction;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> onewaySynonymsAction;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleRedirectActionArgs> redirectAction;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleReplacementActionArgs> replacementAction;
        private @Nullable Input<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> twowaySynonymsAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostAction = defaults.boostAction;
    	      this.condition = defaults.condition;
    	      this.doNotAssociateAction = defaults.doNotAssociateAction;
    	      this.filterAction = defaults.filterAction;
    	      this.ignoreAction = defaults.ignoreAction;
    	      this.onewaySynonymsAction = defaults.onewaySynonymsAction;
    	      this.redirectAction = defaults.redirectAction;
    	      this.replacementAction = defaults.replacementAction;
    	      this.twowaySynonymsAction = defaults.twowaySynonymsAction;
        }

        public Builder setBoostAction(@Nullable Input<GoogleCloudRetailV2alphaRuleBoostActionArgs> boostAction) {
            this.boostAction = boostAction;
            return this;
        }

        public Builder setBoostAction(@Nullable GoogleCloudRetailV2alphaRuleBoostActionArgs boostAction) {
            this.boostAction = Input.ofNullable(boostAction);
            return this;
        }

        public Builder setCondition(Input<GoogleCloudRetailV2alphaConditionArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCondition(GoogleCloudRetailV2alphaConditionArgs condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
            return this;
        }

        public Builder setDoNotAssociateAction(@Nullable Input<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> doNotAssociateAction) {
            this.doNotAssociateAction = doNotAssociateAction;
            return this;
        }

        public Builder setDoNotAssociateAction(@Nullable GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs doNotAssociateAction) {
            this.doNotAssociateAction = Input.ofNullable(doNotAssociateAction);
            return this;
        }

        public Builder setFilterAction(@Nullable Input<GoogleCloudRetailV2alphaRuleFilterActionArgs> filterAction) {
            this.filterAction = filterAction;
            return this;
        }

        public Builder setFilterAction(@Nullable GoogleCloudRetailV2alphaRuleFilterActionArgs filterAction) {
            this.filterAction = Input.ofNullable(filterAction);
            return this;
        }

        public Builder setIgnoreAction(@Nullable Input<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> ignoreAction) {
            this.ignoreAction = ignoreAction;
            return this;
        }

        public Builder setIgnoreAction(@Nullable GoogleCloudRetailV2alphaRuleIgnoreActionArgs ignoreAction) {
            this.ignoreAction = Input.ofNullable(ignoreAction);
            return this;
        }

        public Builder setOnewaySynonymsAction(@Nullable Input<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> onewaySynonymsAction) {
            this.onewaySynonymsAction = onewaySynonymsAction;
            return this;
        }

        public Builder setOnewaySynonymsAction(@Nullable GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs onewaySynonymsAction) {
            this.onewaySynonymsAction = Input.ofNullable(onewaySynonymsAction);
            return this;
        }

        public Builder setRedirectAction(@Nullable Input<GoogleCloudRetailV2alphaRuleRedirectActionArgs> redirectAction) {
            this.redirectAction = redirectAction;
            return this;
        }

        public Builder setRedirectAction(@Nullable GoogleCloudRetailV2alphaRuleRedirectActionArgs redirectAction) {
            this.redirectAction = Input.ofNullable(redirectAction);
            return this;
        }

        public Builder setReplacementAction(@Nullable Input<GoogleCloudRetailV2alphaRuleReplacementActionArgs> replacementAction) {
            this.replacementAction = replacementAction;
            return this;
        }

        public Builder setReplacementAction(@Nullable GoogleCloudRetailV2alphaRuleReplacementActionArgs replacementAction) {
            this.replacementAction = Input.ofNullable(replacementAction);
            return this;
        }

        public Builder setTwowaySynonymsAction(@Nullable Input<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> twowaySynonymsAction) {
            this.twowaySynonymsAction = twowaySynonymsAction;
            return this;
        }

        public Builder setTwowaySynonymsAction(@Nullable GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs twowaySynonymsAction) {
            this.twowaySynonymsAction = Input.ofNullable(twowaySynonymsAction);
            return this;
        }

        public GoogleCloudRetailV2alphaRuleArgs build() {
            return new GoogleCloudRetailV2alphaRuleArgs(boostAction, condition, doNotAssociateAction, filterAction, ignoreAction, onewaySynonymsAction, redirectAction, replacementAction, twowaySynonymsAction);
        }
    }
}