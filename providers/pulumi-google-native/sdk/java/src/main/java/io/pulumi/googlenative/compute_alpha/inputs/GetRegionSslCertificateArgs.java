// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionSslCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionSslCertificateArgs Empty = new GetRegionSslCertificateArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="sslCertificate", required=true)
      private final String sslCertificate;

    public String getSslCertificate() {
        return this.sslCertificate;
    }

    public GetRegionSslCertificateArgs(
        @Nullable String project,
        String region,
        String sslCertificate) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.sslCertificate = Objects.requireNonNull(sslCertificate, "expected parameter 'sslCertificate' to be non-null");
    }

    private GetRegionSslCertificateArgs() {
        this.project = null;
        this.region = null;
        this.sslCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String sslCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionSslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.sslCertificate = defaults.sslCertificate;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSslCertificate(String sslCertificate) {
            this.sslCertificate = Objects.requireNonNull(sslCertificate);
            return this;
        }
        public GetRegionSslCertificateArgs build() {
            return new GetRegionSslCertificateArgs(project, region, sslCertificate);
        }
    }
}
