// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.DistributionOriginGroupFailoverCriteria;
import io.pulumi.aws.cloudfront.outputs.DistributionOriginGroupMember;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DistributionOriginGroup {
    /**
     * The failover criteria for when to failover to the secondary origin
     * 
     */
    private final DistributionOriginGroupFailoverCriteria failoverCriteria;
    /**
     * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    private final List<DistributionOriginGroupMember> members;
    /**
     * The unique identifier of the member origin
     * 
     */
    private final String originId;

    @OutputCustomType.Constructor({"failoverCriteria","members","originId"})
    private DistributionOriginGroup(
        DistributionOriginGroupFailoverCriteria failoverCriteria,
        List<DistributionOriginGroupMember> members,
        String originId) {
        this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
        this.members = Objects.requireNonNull(members);
        this.originId = Objects.requireNonNull(originId);
    }

    /**
     * The failover criteria for when to failover to the secondary origin
     * 
     */
    public DistributionOriginGroupFailoverCriteria getFailoverCriteria() {
        return this.failoverCriteria;
    }
    /**
     * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    public List<DistributionOriginGroupMember> getMembers() {
        return this.members;
    }
    /**
     * The unique identifier of the member origin
     * 
     */
    public String getOriginId() {
        return this.originId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupFailoverCriteria failoverCriteria;
        private List<DistributionOriginGroupMember> members;
        private String originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.members = defaults.members;
    	      this.originId = defaults.originId;
        }

        public Builder setFailoverCriteria(DistributionOriginGroupFailoverCriteria failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }

        public Builder setMembers(List<DistributionOriginGroupMember> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setOriginId(String originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }
        public DistributionOriginGroup build() {
            return new DistributionOriginGroup(failoverCriteria, members, originId);
        }
    }
}
