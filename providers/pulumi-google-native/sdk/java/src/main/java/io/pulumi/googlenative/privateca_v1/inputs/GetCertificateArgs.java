// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    @InputImport(name="caPoolId", required=true)
      private final String caPoolId;

    public String getCaPoolId() {
        return this.caPoolId;
    }

    @InputImport(name="certificateId", required=true)
      private final String certificateId;

    public String getCertificateId() {
        return this.certificateId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetCertificateArgs(
        String caPoolId,
        String certificateId,
        String location,
        @Nullable String project) {
        this.caPoolId = Objects.requireNonNull(caPoolId, "expected parameter 'caPoolId' to be non-null");
        this.certificateId = Objects.requireNonNull(certificateId, "expected parameter 'certificateId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetCertificateArgs() {
        this.caPoolId = null;
        this.certificateId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caPoolId;
        private String certificateId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPoolId = defaults.caPoolId;
    	      this.certificateId = defaults.certificateId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setCaPoolId(String caPoolId) {
            this.caPoolId = Objects.requireNonNull(caPoolId);
            return this;
        }

        public Builder setCertificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetCertificateArgs build() {
            return new GetCertificateArgs(caPoolId, certificateId, location, project);
        }
    }
}
