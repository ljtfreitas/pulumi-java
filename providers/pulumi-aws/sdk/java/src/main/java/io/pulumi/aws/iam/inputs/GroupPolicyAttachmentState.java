// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupPolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentState Empty = new GroupPolicyAttachmentState();

    /**
     * The group the policy should be applied to
     * 
     */
    @InputImport(name="group")
    private final @Nullable Input<String> group;

    public Input<String> getGroup() {
        return this.group == null ? Input.empty() : this.group;
    }

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @InputImport(name="policyArn")
    private final @Nullable Input<String> policyArn;

    public Input<String> getPolicyArn() {
        return this.policyArn == null ? Input.empty() : this.policyArn;
    }

    public GroupPolicyAttachmentState(
        @Nullable Input<String> group,
        @Nullable Input<String> policyArn) {
        this.group = group;
        this.policyArn = policyArn;
    }

    private GroupPolicyAttachmentState() {
        this.group = Input.empty();
        this.policyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> group;
        private @Nullable Input<String> policyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.policyArn = defaults.policyArn;
        }

        public Builder setGroup(@Nullable Input<String> group) {
            this.group = group;
            return this;
        }

        public Builder setPolicyArn(@Nullable Input<String> policyArn) {
            this.policyArn = policyArn;
            return this;
        }

        public Builder setPolicyArn(@Nullable String policyArn) {
            this.policyArn = Input.ofNullable(policyArn);
            return this;
        }
        public GroupPolicyAttachmentState build() {
            return new GroupPolicyAttachmentState(group, policyArn);
        }
    }
}
