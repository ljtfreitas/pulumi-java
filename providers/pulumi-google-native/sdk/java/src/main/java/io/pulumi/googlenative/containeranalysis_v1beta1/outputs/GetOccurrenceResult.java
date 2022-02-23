// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DocumentOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.FileOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1BuildDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1DeploymentDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1DiscoveryDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1ImageDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1IntotoDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1PackageDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1VulnerabilityDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.PackageInfoOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.RelationshipOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.ResourceResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetOccurrenceResult {
    /**
     * Describes an attestation of an artifact.
     * 
     */
    private final DetailsResponse attestation;
    /**
     * Describes a verifiable build.
     * 
     */
    private final GrafeasV1beta1BuildDetailsResponse build;
    /**
     * The time this occurrence was created.
     * 
     */
    private final String createTime;
    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    private final GrafeasV1beta1DeploymentDetailsResponse deployment;
    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    private final GrafeasV1beta1ImageDetailsResponse derivedImage;
    /**
     * Describes when a resource was discovered.
     * 
     */
    private final GrafeasV1beta1DiscoveryDetailsResponse discovered;
    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    private final GrafeasV1beta1PackageDetailsResponse installation;
    /**
     * Describes a specific in-toto link.
     * 
     */
    private final GrafeasV1beta1IntotoDetailsResponse intoto;
    /**
     * This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * 
     */
    private final String name;
    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    private final String noteName;
    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    private final String remediation;
    /**
     * Immutable. The resource for which the occurrence applies.
     * 
     */
    private final ResourceResponse resource;
    /**
     * Describes a specific software bill of materials document.
     * 
     */
    private final DocumentOccurrenceResponse sbom;
    /**
     * Describes a specific SPDX File.
     * 
     */
    private final FileOccurrenceResponse spdxFile;
    /**
     * Describes a specific SPDX Package.
     * 
     */
    private final PackageInfoOccurrenceResponse spdxPackage;
    /**
     * Describes a specific SPDX Relationship.
     * 
     */
    private final RelationshipOccurrenceResponse spdxRelationship;
    /**
     * The time this occurrence was last updated.
     * 
     */
    private final String updateTime;
    /**
     * Describes a security vulnerability.
     * 
     */
    private final GrafeasV1beta1VulnerabilityDetailsResponse vulnerability;

    @OutputCustomType.Constructor({"attestation","build","createTime","deployment","derivedImage","discovered","installation","intoto","kind","name","noteName","remediation","resource","sbom","spdxFile","spdxPackage","spdxRelationship","updateTime","vulnerability"})
    private GetOccurrenceResult(
        DetailsResponse attestation,
        GrafeasV1beta1BuildDetailsResponse build,
        String createTime,
        GrafeasV1beta1DeploymentDetailsResponse deployment,
        GrafeasV1beta1ImageDetailsResponse derivedImage,
        GrafeasV1beta1DiscoveryDetailsResponse discovered,
        GrafeasV1beta1PackageDetailsResponse installation,
        GrafeasV1beta1IntotoDetailsResponse intoto,
        String kind,
        String name,
        String noteName,
        String remediation,
        ResourceResponse resource,
        DocumentOccurrenceResponse sbom,
        FileOccurrenceResponse spdxFile,
        PackageInfoOccurrenceResponse spdxPackage,
        RelationshipOccurrenceResponse spdxRelationship,
        String updateTime,
        GrafeasV1beta1VulnerabilityDetailsResponse vulnerability) {
        this.attestation = Objects.requireNonNull(attestation);
        this.build = Objects.requireNonNull(build);
        this.createTime = Objects.requireNonNull(createTime);
        this.deployment = Objects.requireNonNull(deployment);
        this.derivedImage = Objects.requireNonNull(derivedImage);
        this.discovered = Objects.requireNonNull(discovered);
        this.installation = Objects.requireNonNull(installation);
        this.intoto = Objects.requireNonNull(intoto);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.noteName = Objects.requireNonNull(noteName);
        this.remediation = Objects.requireNonNull(remediation);
        this.resource = Objects.requireNonNull(resource);
        this.sbom = Objects.requireNonNull(sbom);
        this.spdxFile = Objects.requireNonNull(spdxFile);
        this.spdxPackage = Objects.requireNonNull(spdxPackage);
        this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.vulnerability = Objects.requireNonNull(vulnerability);
    }

    /**
     * Describes an attestation of an artifact.
     * 
     */
    public DetailsResponse getAttestation() {
        return this.attestation;
    }
    /**
     * Describes a verifiable build.
     * 
     */
    public GrafeasV1beta1BuildDetailsResponse getBuild() {
        return this.build;
    }
    /**
     * The time this occurrence was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    public GrafeasV1beta1DeploymentDetailsResponse getDeployment() {
        return this.deployment;
    }
    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    public GrafeasV1beta1ImageDetailsResponse getDerivedImage() {
        return this.derivedImage;
    }
    /**
     * Describes when a resource was discovered.
     * 
     */
    public GrafeasV1beta1DiscoveryDetailsResponse getDiscovered() {
        return this.discovered;
    }
    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    public GrafeasV1beta1PackageDetailsResponse getInstallation() {
        return this.installation;
    }
    /**
     * Describes a specific in-toto link.
     * 
     */
    public GrafeasV1beta1IntotoDetailsResponse getIntoto() {
        return this.intoto;
    }
    /**
     * This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    public String getNoteName() {
        return this.noteName;
    }
    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    public String getRemediation() {
        return this.remediation;
    }
    /**
     * Immutable. The resource for which the occurrence applies.
     * 
     */
    public ResourceResponse getResource() {
        return this.resource;
    }
    /**
     * Describes a specific software bill of materials document.
     * 
     */
    public DocumentOccurrenceResponse getSbom() {
        return this.sbom;
    }
    /**
     * Describes a specific SPDX File.
     * 
     */
    public FileOccurrenceResponse getSpdxFile() {
        return this.spdxFile;
    }
    /**
     * Describes a specific SPDX Package.
     * 
     */
    public PackageInfoOccurrenceResponse getSpdxPackage() {
        return this.spdxPackage;
    }
    /**
     * Describes a specific SPDX Relationship.
     * 
     */
    public RelationshipOccurrenceResponse getSpdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * The time this occurrence was last updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Describes a security vulnerability.
     * 
     */
    public GrafeasV1beta1VulnerabilityDetailsResponse getVulnerability() {
        return this.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOccurrenceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetailsResponse attestation;
        private GrafeasV1beta1BuildDetailsResponse build;
        private String createTime;
        private GrafeasV1beta1DeploymentDetailsResponse deployment;
        private GrafeasV1beta1ImageDetailsResponse derivedImage;
        private GrafeasV1beta1DiscoveryDetailsResponse discovered;
        private GrafeasV1beta1PackageDetailsResponse installation;
        private GrafeasV1beta1IntotoDetailsResponse intoto;
        private String kind;
        private String name;
        private String noteName;
        private String remediation;
        private ResourceResponse resource;
        private DocumentOccurrenceResponse sbom;
        private FileOccurrenceResponse spdxFile;
        private PackageInfoOccurrenceResponse spdxPackage;
        private RelationshipOccurrenceResponse spdxRelationship;
        private String updateTime;
        private GrafeasV1beta1VulnerabilityDetailsResponse vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOccurrenceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.build = defaults.build;
    	      this.createTime = defaults.createTime;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.installation = defaults.installation;
    	      this.intoto = defaults.intoto;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.noteName = defaults.noteName;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder setAttestation(DetailsResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }

        public Builder setBuild(GrafeasV1beta1BuildDetailsResponse build) {
            this.build = Objects.requireNonNull(build);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeployment(GrafeasV1beta1DeploymentDetailsResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }

        public Builder setDerivedImage(GrafeasV1beta1ImageDetailsResponse derivedImage) {
            this.derivedImage = Objects.requireNonNull(derivedImage);
            return this;
        }

        public Builder setDiscovered(GrafeasV1beta1DiscoveryDetailsResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }

        public Builder setInstallation(GrafeasV1beta1PackageDetailsResponse installation) {
            this.installation = Objects.requireNonNull(installation);
            return this;
        }

        public Builder setIntoto(GrafeasV1beta1IntotoDetailsResponse intoto) {
            this.intoto = Objects.requireNonNull(intoto);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNoteName(String noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }

        public Builder setRemediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }

        public Builder setResource(ResourceResponse resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setSbom(DocumentOccurrenceResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }

        public Builder setSpdxFile(FileOccurrenceResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }

        public Builder setSpdxPackage(PackageInfoOccurrenceResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }

        public Builder setSpdxRelationship(RelationshipOccurrenceResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVulnerability(GrafeasV1beta1VulnerabilityDetailsResponse vulnerability) {
            this.vulnerability = Objects.requireNonNull(vulnerability);
            return this;
        }
        public GetOccurrenceResult build() {
            return new GetOccurrenceResult(attestation, build, createTime, deployment, derivedImage, discovered, installation, intoto, kind, name, noteName, remediation, resource, sbom, spdxFile, spdxPackage, spdxRelationship, updateTime, vulnerability);
        }
    }
}
