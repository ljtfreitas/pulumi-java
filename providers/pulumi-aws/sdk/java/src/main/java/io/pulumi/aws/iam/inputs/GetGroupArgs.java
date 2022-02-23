// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupArgs Empty = new GetGroupArgs();

    /**
     * The friendly IAM group name to match.
     * 
     */
    @InputImport(name="groupName", required=true)
    private final String groupName;

    public String getGroupName() {
        return this.groupName;
    }

    public GetGroupArgs(String groupName) {
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
    }

    private GetGroupArgs() {
        this.groupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public GetGroupArgs build() {
            return new GetGroupArgs(groupName);
        }
    }
}