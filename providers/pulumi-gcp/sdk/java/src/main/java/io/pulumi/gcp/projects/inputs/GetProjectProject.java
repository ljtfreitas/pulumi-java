// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetProjectProject extends io.pulumi.resources.InvokeArgs {

    public static final GetProjectProject Empty = new GetProjectProject();

    @InputImport(name="createTime", required=true)
        private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="labels", required=true)
        private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    @InputImport(name="lifecycleState", required=true)
        private final String lifecycleState;

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="number", required=true)
        private final String number;

    public String getNumber() {
        return this.number;
    }

    @InputImport(name="parent", required=true)
        private final Map<String,String> parent;

    public Map<String,String> getParent() {
        return this.parent;
    }

    /**
     * The project id of the project.
     * 
     */
    @InputImport(name="projectId", required=true)
        private final String projectId;

    public String getProjectId() {
        return this.projectId;
    }

    public GetProjectProject(
        String createTime,
        Map<String,String> labels,
        String lifecycleState,
        String name,
        String number,
        Map<String,String> parent,
        String projectId) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.lifecycleState = Objects.requireNonNull(lifecycleState, "expected parameter 'lifecycleState' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private GetProjectProject() {
        this.createTime = null;
        this.labels = Map.of();
        this.lifecycleState = null;
        this.name = null;
        this.number = null;
        this.parent = Map.of();
        this.projectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectProject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private Map<String,String> labels;
        private String lifecycleState;
        private String name;
        private String number;
        private Map<String,String> parent;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.parent = defaults.parent;
    	      this.projectId = defaults.projectId;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNumber(String number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }

        public Builder setParent(Map<String,String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public GetProjectProject build() {
            return new GetProjectProject(createTime, labels, lifecycleState, name, number, parent, projectId);
        }
    }
}
