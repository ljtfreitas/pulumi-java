// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ManagedSslCertificateManagedArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedSslCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedSslCertificateArgs Empty = new ManagedSslCertificateArgs();

    /**
     * The unique identifier for the resource.
     * 
     */
    @InputImport(name="certificateId")
        private final @Nullable Input<Integer> certificateId;

    public Input<Integer> getCertificateId() {
        return this.certificateId == null ? Input.empty() : this.certificateId;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * 
     */
    @InputImport(name="managed")
        private final @Nullable Input<ManagedSslCertificateManagedArgs> managed;

    public Input<ManagedSslCertificateManagedArgs> getManaged() {
        return this.managed == null ? Input.empty() : this.managed;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

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
     * Enum field whose value is always `MANAGED` - used to signal to the API
     * which type this is.
     * Default value is `MANAGED`.
     * Possible values are `MANAGED`.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ManagedSslCertificateArgs(
        @Nullable Input<Integer> certificateId,
        @Nullable Input<String> description,
        @Nullable Input<ManagedSslCertificateManagedArgs> managed,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> type) {
        this.certificateId = certificateId;
        this.description = description;
        this.managed = managed;
        this.name = name;
        this.project = project;
        this.type = type;
    }

    private ManagedSslCertificateArgs() {
        this.certificateId = Input.empty();
        this.description = Input.empty();
        this.managed = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> certificateId;
        private @Nullable Input<String> description;
        private @Nullable Input<ManagedSslCertificateManagedArgs> managed;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedSslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.description = defaults.description;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder setCertificateId(@Nullable Input<Integer> certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        public Builder setCertificateId(@Nullable Integer certificateId) {
            this.certificateId = Input.ofNullable(certificateId);
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

        public Builder setManaged(@Nullable Input<ManagedSslCertificateManagedArgs> managed) {
            this.managed = managed;
            return this;
        }

        public Builder setManaged(@Nullable ManagedSslCertificateManagedArgs managed) {
            this.managed = Input.ofNullable(managed);
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

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ManagedSslCertificateArgs build() {
            return new ManagedSslCertificateArgs(certificateId, description, managed, name, project, type);
        }
    }
}
