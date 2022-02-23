// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HmacKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final HmacKeyArgs Empty = new HmacKeyArgs();

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The email address of the key's associated service account.
     * 
     */
    @InputImport(name="serviceAccountEmail", required=true)
        private final Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    /**
     * The state of the key. Can be set to one of ACTIVE, INACTIVE.
     * Default value is `ACTIVE`.
     * Possible values are `ACTIVE` and `INACTIVE`.
     * 
     */
    @InputImport(name="state")
        private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public HmacKeyArgs(
        @Nullable Input<String> project,
        Input<String> serviceAccountEmail,
        @Nullable Input<String> state) {
        this.project = project;
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
        this.state = state;
    }

    private HmacKeyArgs() {
        this.project = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HmacKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> project;
        private Input<String> serviceAccountEmail;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(HmacKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceAccountEmail(Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Input.of(Objects.requireNonNull(serviceAccountEmail));
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public HmacKeyArgs build() {
            return new HmacKeyArgs(project, serviceAccountEmail, state);
        }
    }
}
