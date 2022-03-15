// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionSslCertificateState extends io.pulumi.resources.ResourceArgs {

    public static final RegionSslCertificateState Empty = new RegionSslCertificateState();

    /**
     * The certificate in PEM format.
     * The certificate chain must be no greater than 5 certs long.
     * The chain must include at least one intermediate cert.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @Import(name="certificateId")
      private final @Nullable Output<Integer> certificateId;

    public Output<Integer> getCertificateId() {
        return this.certificateId == null ? Output.empty() : this.certificateId;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
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
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * The write-only private key in PEM format.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Output.empty() : this.privateKey;
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
     * The Region in which the created regional ssl certificate should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    public RegionSslCertificateState(
        @Nullable Output<String> certificate,
        @Nullable Output<Integer> certificateId,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> selfLink) {
        this.certificate = certificate;
        this.certificateId = certificateId;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.namePrefix = namePrefix;
        this.privateKey = privateKey;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    private RegionSslCertificateState() {
        this.certificate = Output.empty();
        this.certificateId = Output.empty();
        this.creationTimestamp = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.privateKey = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.selfLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSslCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificate;
        private @Nullable Output<Integer> certificateId;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSslCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateId = defaults.certificateId;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }

        public Builder certificateId(@Nullable Output<Integer> certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        public Builder certificateId(@Nullable Integer certificateId) {
            this.certificateId = Output.ofNullable(certificateId);
            return this;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }

        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Output.ofNullable(privateKey);
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public RegionSslCertificateState build() {
            return new RegionSslCertificateState(certificate, certificateId, creationTimestamp, description, name, namePrefix, privateKey, project, region, selfLink);
        }
    }
}
