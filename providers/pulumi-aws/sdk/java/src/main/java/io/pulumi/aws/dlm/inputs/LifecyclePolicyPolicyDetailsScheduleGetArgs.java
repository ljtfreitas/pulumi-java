// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs;
import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs;
import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleGetArgs Empty = new LifecyclePolicyPolicyDetailsScheduleGetArgs();

    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    @InputImport(name="copyTags")
    private final @Nullable Input<Boolean> copyTags;

    public Input<Boolean> getCopyTags() {
        return this.copyTags == null ? Input.empty() : this.copyTags;
    }

    /**
     * See the `create_rule` block. Max of 1 per schedule.
     * 
     */
    @InputImport(name="createRule", required=true)
    private final Input<LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs> createRule;

    public Input<LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs> getCreateRule() {
        return this.createRule;
    }

    /**
     * See the `cross_region_copy_rule` block. Max of 3 per schedule.
     * 
     */
    @InputImport(name="crossRegionCopyRules")
    private final @Nullable Input<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs>> crossRegionCopyRules;

    public Input<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs>> getCrossRegionCopyRules() {
        return this.crossRegionCopyRules == null ? Input.empty() : this.crossRegionCopyRules;
    }

    /**
     * A name for the schedule.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    @InputImport(name="retainRule", required=true)
    private final Input<LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs> retainRule;

    public Input<LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs> getRetainRule() {
        return this.retainRule;
    }

    /**
     * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     * 
     */
    @InputImport(name="tagsToAdd")
    private final @Nullable Input<Map<String,String>> tagsToAdd;

    public Input<Map<String,String>> getTagsToAdd() {
        return this.tagsToAdd == null ? Input.empty() : this.tagsToAdd;
    }

    public LifecyclePolicyPolicyDetailsScheduleGetArgs(
        @Nullable Input<Boolean> copyTags,
        Input<LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs> createRule,
        @Nullable Input<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs>> crossRegionCopyRules,
        Input<String> name,
        Input<LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs> retainRule,
        @Nullable Input<Map<String,String>> tagsToAdd) {
        this.copyTags = copyTags;
        this.createRule = Objects.requireNonNull(createRule, "expected parameter 'createRule' to be non-null");
        this.crossRegionCopyRules = crossRegionCopyRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.retainRule = Objects.requireNonNull(retainRule, "expected parameter 'retainRule' to be non-null");
        this.tagsToAdd = tagsToAdd;
    }

    private LifecyclePolicyPolicyDetailsScheduleGetArgs() {
        this.copyTags = Input.empty();
        this.createRule = Input.empty();
        this.crossRegionCopyRules = Input.empty();
        this.name = Input.empty();
        this.retainRule = Input.empty();
        this.tagsToAdd = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> copyTags;
        private Input<LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs> createRule;
        private @Nullable Input<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs>> crossRegionCopyRules;
        private Input<String> name;
        private Input<LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs> retainRule;
        private @Nullable Input<Map<String,String>> tagsToAdd;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyTags = defaults.copyTags;
    	      this.createRule = defaults.createRule;
    	      this.crossRegionCopyRules = defaults.crossRegionCopyRules;
    	      this.name = defaults.name;
    	      this.retainRule = defaults.retainRule;
    	      this.tagsToAdd = defaults.tagsToAdd;
        }

        public Builder setCopyTags(@Nullable Input<Boolean> copyTags) {
            this.copyTags = copyTags;
            return this;
        }

        public Builder setCopyTags(@Nullable Boolean copyTags) {
            this.copyTags = Input.ofNullable(copyTags);
            return this;
        }

        public Builder setCreateRule(Input<LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs> createRule) {
            this.createRule = Objects.requireNonNull(createRule);
            return this;
        }

        public Builder setCreateRule(LifecyclePolicyPolicyDetailsScheduleCreateRuleGetArgs createRule) {
            this.createRule = Input.of(Objects.requireNonNull(createRule));
            return this;
        }

        public Builder setCrossRegionCopyRules(@Nullable Input<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs>> crossRegionCopyRules) {
            this.crossRegionCopyRules = crossRegionCopyRules;
            return this;
        }

        public Builder setCrossRegionCopyRules(@Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs> crossRegionCopyRules) {
            this.crossRegionCopyRules = Input.ofNullable(crossRegionCopyRules);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRetainRule(Input<LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs> retainRule) {
            this.retainRule = Objects.requireNonNull(retainRule);
            return this;
        }

        public Builder setRetainRule(LifecyclePolicyPolicyDetailsScheduleRetainRuleGetArgs retainRule) {
            this.retainRule = Input.of(Objects.requireNonNull(retainRule));
            return this;
        }

        public Builder setTagsToAdd(@Nullable Input<Map<String,String>> tagsToAdd) {
            this.tagsToAdd = tagsToAdd;
            return this;
        }

        public Builder setTagsToAdd(@Nullable Map<String,String> tagsToAdd) {
            this.tagsToAdd = Input.ofNullable(tagsToAdd);
            return this;
        }
        public LifecyclePolicyPolicyDetailsScheduleGetArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleGetArgs(copyTags, createRule, crossRegionCopyRules, name, retainRule, tagsToAdd);
        }
    }
}