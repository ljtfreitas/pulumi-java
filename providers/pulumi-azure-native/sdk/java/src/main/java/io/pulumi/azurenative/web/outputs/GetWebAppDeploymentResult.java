// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppDeploymentResult {
    /**
     * True if deployment is currently active, false if completed and null if not started.
     * 
     */
    private final @Nullable Boolean active;
    /**
     * Who authored the deployment.
     * 
     */
    private final @Nullable String author;
    /**
     * Author email.
     * 
     */
    private final @Nullable String authorEmail;
    /**
     * Who performed the deployment.
     * 
     */
    private final @Nullable String deployer;
    /**
     * Details on deployment.
     * 
     */
    private final @Nullable String details;
    /**
     * End time.
     * 
     */
    private final @Nullable String endTime;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Details about deployment status.
     * 
     */
    private final @Nullable String message;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Start time.
     * 
     */
    private final @Nullable String startTime;
    /**
     * Deployment status.
     * 
     */
    private final @Nullable Integer status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebAppDeploymentResult(
        @CustomType.Parameter("active") @Nullable Boolean active,
        @CustomType.Parameter("author") @Nullable String author,
        @CustomType.Parameter("authorEmail") @Nullable String authorEmail,
        @CustomType.Parameter("deployer") @Nullable String deployer,
        @CustomType.Parameter("details") @Nullable String details,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("status") @Nullable Integer status,
        @CustomType.Parameter("type") String type) {
        this.active = active;
        this.author = author;
        this.authorEmail = authorEmail;
        this.deployer = deployer;
        this.details = details;
        this.endTime = endTime;
        this.id = id;
        this.kind = kind;
        this.message = message;
        this.name = name;
        this.startTime = startTime;
        this.status = status;
        this.type = type;
    }

    /**
     * True if deployment is currently active, false if completed and null if not started.
     * 
    */
    public Optional<Boolean> getActive() {
        return Optional.ofNullable(this.active);
    }
    /**
     * Who authored the deployment.
     * 
    */
    public Optional<String> getAuthor() {
        return Optional.ofNullable(this.author);
    }
    /**
     * Author email.
     * 
    */
    public Optional<String> getAuthorEmail() {
        return Optional.ofNullable(this.authorEmail);
    }
    /**
     * Who performed the deployment.
     * 
    */
    public Optional<String> getDeployer() {
        return Optional.ofNullable(this.deployer);
    }
    /**
     * Details on deployment.
     * 
    */
    public Optional<String> getDetails() {
        return Optional.ofNullable(this.details);
    }
    /**
     * End time.
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Details about deployment status.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Start time.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * Deployment status.
     * 
    */
    public Optional<Integer> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean active;
        private @Nullable String author;
        private @Nullable String authorEmail;
        private @Nullable String deployer;
        private @Nullable String details;
        private @Nullable String endTime;
        private String id;
        private @Nullable String kind;
        private @Nullable String message;
        private String name;
        private @Nullable String startTime;
        private @Nullable Integer status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppDeploymentResult defaults) {
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
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder active(@Nullable Boolean active) {
            this.active = active;
            return this;
        }

        public Builder author(@Nullable String author) {
            this.author = author;
            return this;
        }

        public Builder authorEmail(@Nullable String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }

        public Builder deployer(@Nullable String deployer) {
            this.deployer = deployer;
            return this;
        }

        public Builder details(@Nullable String details) {
            this.details = details;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder status(@Nullable Integer status) {
            this.status = status;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppDeploymentResult build() {
            return new GetWebAppDeploymentResult(active, author, authorEmail, deployer, details, endTime, id, kind, message, name, startTime, status, type);
        }
    }
}
