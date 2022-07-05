// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.DetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.DocumentOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.EnvelopeArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.FileOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1BuildDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1DeploymentDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1DiscoveryDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1ImageDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1IntotoDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1PackageDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GrafeasV1beta1VulnerabilityDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.PackageInfoOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.RelationshipOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @Import(name="attestation")
    private @Nullable Output<DetailsArgs> attestation;

    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    public Optional<Output<DetailsArgs>> attestation() {
        return Optional.ofNullable(this.attestation);
    }

    /**
     * Describes a verifiable build.
     * 
     */
    @Import(name="build")
    private @Nullable Output<GrafeasV1beta1BuildDetailsArgs> build;

    /**
     * @return Describes a verifiable build.
     * 
     */
    public Optional<Output<GrafeasV1beta1BuildDetailsArgs>> build() {
        return Optional.ofNullable(this.build);
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @Import(name="deployment")
    private @Nullable Output<GrafeasV1beta1DeploymentDetailsArgs> deployment;

    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    public Optional<Output<GrafeasV1beta1DeploymentDetailsArgs>> deployment() {
        return Optional.ofNullable(this.deployment);
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @Import(name="derivedImage")
    private @Nullable Output<GrafeasV1beta1ImageDetailsArgs> derivedImage;

    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    public Optional<Output<GrafeasV1beta1ImageDetailsArgs>> derivedImage() {
        return Optional.ofNullable(this.derivedImage);
    }

    /**
     * Describes when a resource was discovered.
     * 
     */
    @Import(name="discovered")
    private @Nullable Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered;

    /**
     * @return Describes when a resource was discovered.
     * 
     */
    public Optional<Output<GrafeasV1beta1DiscoveryDetailsArgs>> discovered() {
        return Optional.ofNullable(this.discovered);
    }

    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @Import(name="envelope")
    private @Nullable Output<EnvelopeArgs> envelope;

    /**
     * @return https://github.com/secure-systems-lab/dsse
     * 
     */
    public Optional<Output<EnvelopeArgs>> envelope() {
        return Optional.ofNullable(this.envelope);
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @Import(name="installation")
    private @Nullable Output<GrafeasV1beta1PackageDetailsArgs> installation;

    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    public Optional<Output<GrafeasV1beta1PackageDetailsArgs>> installation() {
        return Optional.ofNullable(this.installation);
    }

    /**
     * Describes a specific in-toto link.
     * 
     */
    @Import(name="intoto")
    private @Nullable Output<GrafeasV1beta1IntotoDetailsArgs> intoto;

    /**
     * @return Describes a specific in-toto link.
     * 
     */
    public Optional<Output<GrafeasV1beta1IntotoDetailsArgs>> intoto() {
        return Optional.ofNullable(this.intoto);
    }

    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    @Import(name="noteName", required=true)
    private Output<String> noteName;

    /**
     * @return Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> noteName() {
        return this.noteName;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @Import(name="remediation")
    private @Nullable Output<String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    public Optional<Output<String>> remediation() {
        return Optional.ofNullable(this.remediation);
    }

    /**
     * Immutable. The resource for which the occurrence applies.
     * 
     */
    @Import(name="resource", required=true)
    private Output<ResourceArgs> resource;

    /**
     * @return Immutable. The resource for which the occurrence applies.
     * 
     */
    public Output<ResourceArgs> resource() {
        return this.resource;
    }

    /**
     * Describes a specific software bill of materials document.
     * 
     */
    @Import(name="sbom")
    private @Nullable Output<DocumentOccurrenceArgs> sbom;

    /**
     * @return Describes a specific software bill of materials document.
     * 
     */
    public Optional<Output<DocumentOccurrenceArgs>> sbom() {
        return Optional.ofNullable(this.sbom);
    }

    /**
     * Describes a specific SPDX File.
     * 
     */
    @Import(name="spdxFile")
    private @Nullable Output<FileOccurrenceArgs> spdxFile;

    /**
     * @return Describes a specific SPDX File.
     * 
     */
    public Optional<Output<FileOccurrenceArgs>> spdxFile() {
        return Optional.ofNullable(this.spdxFile);
    }

    /**
     * Describes a specific SPDX Package.
     * 
     */
    @Import(name="spdxPackage")
    private @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage;

    /**
     * @return Describes a specific SPDX Package.
     * 
     */
    public Optional<Output<PackageInfoOccurrenceArgs>> spdxPackage() {
        return Optional.ofNullable(this.spdxPackage);
    }

    /**
     * Describes a specific SPDX Relationship.
     * 
     */
    @Import(name="spdxRelationship")
    private @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship;

    /**
     * @return Describes a specific SPDX Relationship.
     * 
     */
    public Optional<Output<RelationshipOccurrenceArgs>> spdxRelationship() {
        return Optional.ofNullable(this.spdxRelationship);
    }

    /**
     * Describes a security vulnerability.
     * 
     */
    @Import(name="vulnerability")
    private @Nullable Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability;

    /**
     * @return Describes a security vulnerability.
     * 
     */
    public Optional<Output<GrafeasV1beta1VulnerabilityDetailsArgs>> vulnerability() {
        return Optional.ofNullable(this.vulnerability);
    }

    private OccurrenceArgs() {}

    private OccurrenceArgs(OccurrenceArgs $) {
        this.attestation = $.attestation;
        this.build = $.build;
        this.deployment = $.deployment;
        this.derivedImage = $.derivedImage;
        this.discovered = $.discovered;
        this.envelope = $.envelope;
        this.installation = $.installation;
        this.intoto = $.intoto;
        this.noteName = $.noteName;
        this.project = $.project;
        this.remediation = $.remediation;
        this.resource = $.resource;
        this.sbom = $.sbom;
        this.spdxFile = $.spdxFile;
        this.spdxPackage = $.spdxPackage;
        this.spdxRelationship = $.spdxRelationship;
        this.vulnerability = $.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OccurrenceArgs $;

        public Builder() {
            $ = new OccurrenceArgs();
        }

        public Builder(OccurrenceArgs defaults) {
            $ = new OccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestation Describes an attestation of an artifact.
         * 
         * @return builder
         * 
         */
        public Builder attestation(@Nullable Output<DetailsArgs> attestation) {
            $.attestation = attestation;
            return this;
        }

        /**
         * @param attestation Describes an attestation of an artifact.
         * 
         * @return builder
         * 
         */
        public Builder attestation(DetailsArgs attestation) {
            return attestation(Output.of(attestation));
        }

        /**
         * @param build Describes a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder build(@Nullable Output<GrafeasV1beta1BuildDetailsArgs> build) {
            $.build = build;
            return this;
        }

        /**
         * @param build Describes a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder build(GrafeasV1beta1BuildDetailsArgs build) {
            return build(Output.of(build));
        }

        /**
         * @param deployment Describes the deployment of an artifact on a runtime.
         * 
         * @return builder
         * 
         */
        public Builder deployment(@Nullable Output<GrafeasV1beta1DeploymentDetailsArgs> deployment) {
            $.deployment = deployment;
            return this;
        }

        /**
         * @param deployment Describes the deployment of an artifact on a runtime.
         * 
         * @return builder
         * 
         */
        public Builder deployment(GrafeasV1beta1DeploymentDetailsArgs deployment) {
            return deployment(Output.of(deployment));
        }

        /**
         * @param derivedImage Describes how this resource derives from the basis in the associated note.
         * 
         * @return builder
         * 
         */
        public Builder derivedImage(@Nullable Output<GrafeasV1beta1ImageDetailsArgs> derivedImage) {
            $.derivedImage = derivedImage;
            return this;
        }

        /**
         * @param derivedImage Describes how this resource derives from the basis in the associated note.
         * 
         * @return builder
         * 
         */
        public Builder derivedImage(GrafeasV1beta1ImageDetailsArgs derivedImage) {
            return derivedImage(Output.of(derivedImage));
        }

        /**
         * @param discovered Describes when a resource was discovered.
         * 
         * @return builder
         * 
         */
        public Builder discovered(@Nullable Output<GrafeasV1beta1DiscoveryDetailsArgs> discovered) {
            $.discovered = discovered;
            return this;
        }

        /**
         * @param discovered Describes when a resource was discovered.
         * 
         * @return builder
         * 
         */
        public Builder discovered(GrafeasV1beta1DiscoveryDetailsArgs discovered) {
            return discovered(Output.of(discovered));
        }

        /**
         * @param envelope https://github.com/secure-systems-lab/dsse
         * 
         * @return builder
         * 
         */
        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            $.envelope = envelope;
            return this;
        }

        /**
         * @param envelope https://github.com/secure-systems-lab/dsse
         * 
         * @return builder
         * 
         */
        public Builder envelope(EnvelopeArgs envelope) {
            return envelope(Output.of(envelope));
        }

        /**
         * @param installation Describes the installation of a package on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder installation(@Nullable Output<GrafeasV1beta1PackageDetailsArgs> installation) {
            $.installation = installation;
            return this;
        }

        /**
         * @param installation Describes the installation of a package on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder installation(GrafeasV1beta1PackageDetailsArgs installation) {
            return installation(Output.of(installation));
        }

        /**
         * @param intoto Describes a specific in-toto link.
         * 
         * @return builder
         * 
         */
        public Builder intoto(@Nullable Output<GrafeasV1beta1IntotoDetailsArgs> intoto) {
            $.intoto = intoto;
            return this;
        }

        /**
         * @param intoto Describes a specific in-toto link.
         * 
         * @return builder
         * 
         */
        public Builder intoto(GrafeasV1beta1IntotoDetailsArgs intoto) {
            return intoto(Output.of(intoto));
        }

        /**
         * @param noteName Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(Output<String> noteName) {
            $.noteName = noteName;
            return this;
        }

        /**
         * @param noteName Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(String noteName) {
            return noteName(Output.of(noteName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param remediation A description of actions that can be taken to remedy the note.
         * 
         * @return builder
         * 
         */
        public Builder remediation(@Nullable Output<String> remediation) {
            $.remediation = remediation;
            return this;
        }

        /**
         * @param remediation A description of actions that can be taken to remedy the note.
         * 
         * @return builder
         * 
         */
        public Builder remediation(String remediation) {
            return remediation(Output.of(remediation));
        }

        /**
         * @param resource Immutable. The resource for which the occurrence applies.
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<ResourceArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Immutable. The resource for which the occurrence applies.
         * 
         * @return builder
         * 
         */
        public Builder resource(ResourceArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param sbom Describes a specific software bill of materials document.
         * 
         * @return builder
         * 
         */
        public Builder sbom(@Nullable Output<DocumentOccurrenceArgs> sbom) {
            $.sbom = sbom;
            return this;
        }

        /**
         * @param sbom Describes a specific software bill of materials document.
         * 
         * @return builder
         * 
         */
        public Builder sbom(DocumentOccurrenceArgs sbom) {
            return sbom(Output.of(sbom));
        }

        /**
         * @param spdxFile Describes a specific SPDX File.
         * 
         * @return builder
         * 
         */
        public Builder spdxFile(@Nullable Output<FileOccurrenceArgs> spdxFile) {
            $.spdxFile = spdxFile;
            return this;
        }

        /**
         * @param spdxFile Describes a specific SPDX File.
         * 
         * @return builder
         * 
         */
        public Builder spdxFile(FileOccurrenceArgs spdxFile) {
            return spdxFile(Output.of(spdxFile));
        }

        /**
         * @param spdxPackage Describes a specific SPDX Package.
         * 
         * @return builder
         * 
         */
        public Builder spdxPackage(@Nullable Output<PackageInfoOccurrenceArgs> spdxPackage) {
            $.spdxPackage = spdxPackage;
            return this;
        }

        /**
         * @param spdxPackage Describes a specific SPDX Package.
         * 
         * @return builder
         * 
         */
        public Builder spdxPackage(PackageInfoOccurrenceArgs spdxPackage) {
            return spdxPackage(Output.of(spdxPackage));
        }

        /**
         * @param spdxRelationship Describes a specific SPDX Relationship.
         * 
         * @return builder
         * 
         */
        public Builder spdxRelationship(@Nullable Output<RelationshipOccurrenceArgs> spdxRelationship) {
            $.spdxRelationship = spdxRelationship;
            return this;
        }

        /**
         * @param spdxRelationship Describes a specific SPDX Relationship.
         * 
         * @return builder
         * 
         */
        public Builder spdxRelationship(RelationshipOccurrenceArgs spdxRelationship) {
            return spdxRelationship(Output.of(spdxRelationship));
        }

        /**
         * @param vulnerability Describes a security vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder vulnerability(@Nullable Output<GrafeasV1beta1VulnerabilityDetailsArgs> vulnerability) {
            $.vulnerability = vulnerability;
            return this;
        }

        /**
         * @param vulnerability Describes a security vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder vulnerability(GrafeasV1beta1VulnerabilityDetailsArgs vulnerability) {
            return vulnerability(Output.of(vulnerability));
        }

        public OccurrenceArgs build() {
            $.noteName = Objects.requireNonNull($.noteName, "expected parameter 'noteName' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
