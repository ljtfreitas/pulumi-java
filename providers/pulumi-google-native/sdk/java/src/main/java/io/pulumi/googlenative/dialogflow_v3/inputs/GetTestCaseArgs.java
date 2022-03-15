// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestCaseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTestCaseArgs Empty = new GetTestCaseArgs();

    @Import(name="agentId", required=true)
      private final String agentId;

    public String getAgentId() {
        return this.agentId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="testCaseId", required=true)
      private final String testCaseId;

    public String getTestCaseId() {
        return this.testCaseId;
    }

    public GetTestCaseArgs(
        String agentId,
        String location,
        @Nullable String project,
        String testCaseId) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.testCaseId = Objects.requireNonNull(testCaseId, "expected parameter 'testCaseId' to be non-null");
    }

    private GetTestCaseArgs() {
        this.agentId = null;
        this.location = null;
        this.project = null;
        this.testCaseId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String location;
        private @Nullable String project;
        private String testCaseId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestCaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.testCaseId = defaults.testCaseId;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder testCaseId(String testCaseId) {
            this.testCaseId = Objects.requireNonNull(testCaseId);
            return this;
        }
        public GetTestCaseArgs build() {
            return new GetTestCaseArgs(agentId, location, project, testCaseId);
        }
    }
}
