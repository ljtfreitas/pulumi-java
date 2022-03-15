// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIdentityState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIdentityState Empty = new ServiceIdentityState();

    /**
     * The email address of the Google managed service account.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The service to generate identity for.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    public ServiceIdentityState(
        @Nullable Output<String> email,
        @Nullable Output<String> project,
        @Nullable Output<String> service) {
        this.email = email;
        this.project = project;
        this.service = service;
    }

    private ServiceIdentityState() {
        this.email = Output.empty();
        this.project = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIdentityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private @Nullable Output<String> project;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIdentityState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public ServiceIdentityState build() {
            return new ServiceIdentityState(email, project, service);
        }
    }
}
