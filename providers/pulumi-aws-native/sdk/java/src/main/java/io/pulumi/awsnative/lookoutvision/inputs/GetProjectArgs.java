// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutvision.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    @Import(name="projectName", required=true)
      private final String projectName;

    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectArgs(String projectName) {
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
    }

    private GetProjectArgs() {
        this.projectName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectName = defaults.projectName;
        }

        public Builder projectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        public GetProjectArgs build() {
            return new GetProjectArgs(projectName);
        }
    }
}
