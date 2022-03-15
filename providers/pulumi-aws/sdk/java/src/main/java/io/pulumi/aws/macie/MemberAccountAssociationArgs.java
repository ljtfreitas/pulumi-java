// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MemberAccountAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemberAccountAssociationArgs Empty = new MemberAccountAssociationArgs();

    /**
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * 
     */
    @Import(name="memberAccountId", required=true)
      private final Output<String> memberAccountId;

    public Output<String> getMemberAccountId() {
        return this.memberAccountId;
    }

    public MemberAccountAssociationArgs(Output<String> memberAccountId) {
        this.memberAccountId = Objects.requireNonNull(memberAccountId, "expected parameter 'memberAccountId' to be non-null");
    }

    private MemberAccountAssociationArgs() {
        this.memberAccountId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberAccountAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> memberAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberAccountAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberAccountId = defaults.memberAccountId;
        }

        public Builder memberAccountId(Output<String> memberAccountId) {
            this.memberAccountId = Objects.requireNonNull(memberAccountId);
            return this;
        }

        public Builder memberAccountId(String memberAccountId) {
            this.memberAccountId = Output.of(Objects.requireNonNull(memberAccountId));
            return this;
        }
        public MemberAccountAssociationArgs build() {
            return new MemberAccountAssociationArgs(memberAccountId);
        }
    }
}
