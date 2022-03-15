// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppDeploymentArgs Empty = new WebAppDeploymentArgs();

    /**
     * True if deployment is currently active, false if completed and null if not started.
     * 
     */
    @Import(name="active")
      private final @Nullable Output<Boolean> active;

    public Output<Boolean> getActive() {
        return this.active == null ? Output.empty() : this.active;
    }

    /**
     * Who authored the deployment.
     * 
     */
    @Import(name="author")
      private final @Nullable Output<String> author;

    public Output<String> getAuthor() {
        return this.author == null ? Output.empty() : this.author;
    }

    /**
     * Author email.
     * 
     */
    @Import(name="authorEmail")
      private final @Nullable Output<String> authorEmail;

    public Output<String> getAuthorEmail() {
        return this.authorEmail == null ? Output.empty() : this.authorEmail;
    }

    /**
     * Who performed the deployment.
     * 
     */
    @Import(name="deployer")
      private final @Nullable Output<String> deployer;

    public Output<String> getDeployer() {
        return this.deployer == null ? Output.empty() : this.deployer;
    }

    /**
     * Details on deployment.
     * 
     */
    @Import(name="details")
      private final @Nullable Output<String> details;

    public Output<String> getDetails() {
        return this.details == null ? Output.empty() : this.details;
    }

    /**
     * End time.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * ID of an existing deployment.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Details about deployment status.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Start time.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Deployment status.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Integer> status;

    public Output<Integer> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public WebAppDeploymentArgs(
        @Nullable Output<Boolean> active,
        @Nullable Output<String> author,
        @Nullable Output<String> authorEmail,
        @Nullable Output<String> deployer,
        @Nullable Output<String> details,
        @Nullable Output<String> endTime,
        @Nullable Output<String> id,
        @Nullable Output<String> kind,
        @Nullable Output<String> message,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> startTime,
        @Nullable Output<Integer> status) {
        this.active = active;
        this.author = author;
        this.authorEmail = authorEmail;
        this.deployer = deployer;
        this.details = details;
        this.endTime = endTime;
        this.id = id;
        this.kind = kind;
        this.message = message;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.startTime = startTime;
        this.status = status;
    }

    private WebAppDeploymentArgs() {
        this.active = Output.empty();
        this.author = Output.empty();
        this.authorEmail = Output.empty();
        this.deployer = Output.empty();
        this.details = Output.empty();
        this.endTime = Output.empty();
        this.id = Output.empty();
        this.kind = Output.empty();
        this.message = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.startTime = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> active;
        private @Nullable Output<String> author;
        private @Nullable Output<String> authorEmail;
        private @Nullable Output<String> deployer;
        private @Nullable Output<String> details;
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> id;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> message;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> startTime;
        private @Nullable Output<Integer> status;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.author = defaults.author;
    	      this.authorEmail = defaults.authorEmail;
    	      this.deployer = defaults.deployer;
    	      this.details = defaults.details;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder active(@Nullable Output<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder active(@Nullable Boolean active) {
            this.active = Output.ofNullable(active);
            return this;
        }

        public Builder author(@Nullable Output<String> author) {
            this.author = author;
            return this;
        }

        public Builder author(@Nullable String author) {
            this.author = Output.ofNullable(author);
            return this;
        }

        public Builder authorEmail(@Nullable Output<String> authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }

        public Builder authorEmail(@Nullable String authorEmail) {
            this.authorEmail = Output.ofNullable(authorEmail);
            return this;
        }

        public Builder deployer(@Nullable Output<String> deployer) {
            this.deployer = deployer;
            return this;
        }

        public Builder deployer(@Nullable String deployer) {
            this.deployer = Output.ofNullable(deployer);
            return this;
        }

        public Builder details(@Nullable Output<String> details) {
            this.details = details;
            return this;
        }

        public Builder details(@Nullable String details) {
            this.details = Output.ofNullable(details);
            return this;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }

        public Builder status(@Nullable Output<Integer> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Integer status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public WebAppDeploymentArgs build() {
            return new WebAppDeploymentArgs(active, author, authorEmail, deployer, details, endTime, id, kind, message, name, resourceGroupName, startTime, status);
        }
    }
}
