// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurenceArgs Empty = new OccurenceArgs();

    /**
     * Occurrence that represents a single "attestation". The authenticity
     * of an attestation can be verified using the attached signature.
     * If the verifier trusts the public key of the signer, then verifying
     * the signature is sufficient to establish trust. In this circumstance,
     * the authority to which this attestation is attached is primarily
     * useful for lookup (how to find this attestation if you already
     * know the authority and artifact to be verified) and intent (for
     * which authority this attestation was intended to sign.
     * Structure is documented below.
     * 
     */
    @Import(name="attestation", required=true)
      private final Output<OccurenceAttestationArgs> attestation;

    public Output<OccurenceAttestationArgs> attestation() {
        return this.attestation;
    }

    /**
     * The analysis note associated with this occurrence, in the form of
     * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
     * filter in list requests.
     * 
     */
    @Import(name="noteName", required=true)
      private final Output<String> noteName;

    public Output<String> noteName() {
        return this.noteName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @Import(name="remediation")
      private final @Nullable Output<String> remediation;

    public Output<String> remediation() {
        return this.remediation == null ? Codegen.empty() : this.remediation;
    }

    /**
     * Required. Immutable. A URI that represents the resource for which
     * the occurrence applies. For example,
     * https://gcr.io/project/image@sha256:123abc for a Docker image.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final Output<String> resourceUri;

    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    public OccurenceArgs(
        Output<OccurenceAttestationArgs> attestation,
        Output<String> noteName,
        @Nullable Output<String> project,
        @Nullable Output<String> remediation,
        Output<String> resourceUri) {
        this.attestation = Objects.requireNonNull(attestation, "expected parameter 'attestation' to be non-null");
        this.noteName = Objects.requireNonNull(noteName, "expected parameter 'noteName' to be non-null");
        this.project = project;
        this.remediation = remediation;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private OccurenceArgs() {
        this.attestation = Codegen.empty();
        this.noteName = Codegen.empty();
        this.project = Codegen.empty();
        this.remediation = Codegen.empty();
        this.resourceUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<OccurenceAttestationArgs> attestation;
        private Output<String> noteName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> remediation;
        private Output<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.noteName = defaults.noteName;
    	      this.project = defaults.project;
    	      this.remediation = defaults.remediation;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder attestation(Output<OccurenceAttestationArgs> attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }
        public Builder attestation(OccurenceAttestationArgs attestation) {
            this.attestation = Output.of(Objects.requireNonNull(attestation));
            return this;
        }
        public Builder noteName(Output<String> noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }
        public Builder noteName(String noteName) {
            this.noteName = Output.of(Objects.requireNonNull(noteName));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder remediation(@Nullable Output<String> remediation) {
            this.remediation = remediation;
            return this;
        }
        public Builder remediation(@Nullable String remediation) {
            this.remediation = Codegen.ofNullable(remediation);
            return this;
        }
        public Builder resourceUri(Output<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Output.of(Objects.requireNonNull(resourceUri));
            return this;
        }        public OccurenceArgs build() {
            return new OccurenceArgs(attestation, noteName, project, remediation, resourceUri);
        }
    }
}
