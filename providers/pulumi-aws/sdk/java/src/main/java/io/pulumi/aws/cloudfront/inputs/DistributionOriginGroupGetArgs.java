// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionOriginGroupFailoverCriteriaGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginGroupMemberGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupGetArgs Empty = new DistributionOriginGroupGetArgs();

    /**
     * The failover criteria for when to failover to the secondary origin
     * 
     */
    @InputImport(name="failoverCriteria", required=true)
    private final Input<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria;

    public Input<DistributionOriginGroupFailoverCriteriaGetArgs> getFailoverCriteria() {
        return this.failoverCriteria;
    }

    /**
     * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    @InputImport(name="members", required=true)
    private final Input<List<DistributionOriginGroupMemberGetArgs>> members;

    public Input<List<DistributionOriginGroupMemberGetArgs>> getMembers() {
        return this.members;
    }

    /**
     * The unique identifier of the member origin
     * 
     */
    @InputImport(name="originId", required=true)
    private final Input<String> originId;

    public Input<String> getOriginId() {
        return this.originId;
    }

    public DistributionOriginGroupGetArgs(
        Input<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria,
        Input<List<DistributionOriginGroupMemberGetArgs>> members,
        Input<String> originId) {
        this.failoverCriteria = Objects.requireNonNull(failoverCriteria, "expected parameter 'failoverCriteria' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
    }

    private DistributionOriginGroupGetArgs() {
        this.failoverCriteria = Input.empty();
        this.members = Input.empty();
        this.originId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria;
        private Input<List<DistributionOriginGroupMemberGetArgs>> members;
        private Input<String> originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.members = defaults.members;
    	      this.originId = defaults.originId;
        }

        public Builder setFailoverCriteria(Input<DistributionOriginGroupFailoverCriteriaGetArgs> failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }

        public Builder setFailoverCriteria(DistributionOriginGroupFailoverCriteriaGetArgs failoverCriteria) {
            this.failoverCriteria = Input.of(Objects.requireNonNull(failoverCriteria));
            return this;
        }

        public Builder setMembers(Input<List<DistributionOriginGroupMemberGetArgs>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<DistributionOriginGroupMemberGetArgs> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder setOriginId(Input<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder setOriginId(String originId) {
            this.originId = Input.of(Objects.requireNonNull(originId));
            return this;
        }
        public DistributionOriginGroupGetArgs build() {
            return new DistributionOriginGroupGetArgs(failoverCriteria, members, originId);
        }
    }
}
