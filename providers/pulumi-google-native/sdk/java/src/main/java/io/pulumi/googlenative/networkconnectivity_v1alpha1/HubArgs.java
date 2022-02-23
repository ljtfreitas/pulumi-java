// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubArgs Empty = new HubArgs();

    /**
     * Time when the Hub was created.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Short description of the hub resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="hubId")
      private final @Nullable Input<String> hubId;

    public Input<String> getHubId() {
        return this.hubId == null ? Input.empty() : this.hubId;
    }

    /**
     * User-defined labels.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Immutable. The name of a Hub resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Time when the Hub was updated.
     * 
     */
    @InputImport(name="updateTime")
      private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public HubArgs(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> hubId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.hubId = hubId;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.updateTime = updateTime;
    }

    private HubArgs() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.hubId = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> hubId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.hubId = defaults.hubId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHubId(@Nullable Input<String> hubId) {
            this.hubId = hubId;
            return this;
        }

        public Builder setHubId(@Nullable String hubId) {
            this.hubId = Input.ofNullable(hubId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public HubArgs build() {
            return new HubArgs(createTime, description, hubId, labels, name, project, requestId, updateTime);
        }
    }
}
