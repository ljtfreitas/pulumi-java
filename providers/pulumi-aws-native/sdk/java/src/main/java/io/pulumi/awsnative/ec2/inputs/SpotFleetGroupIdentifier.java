// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetGroupIdentifier extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetGroupIdentifier Empty = new SpotFleetGroupIdentifier();

    @Import(name="groupId", required=true)
      private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    public SpotFleetGroupIdentifier(String groupId) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
    }

    private SpotFleetGroupIdentifier() {
        this.groupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetGroupIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetGroupIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
        }

        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public SpotFleetGroupIdentifier build() {
            return new SpotFleetGroupIdentifier(groupId);
        }
    }
}
