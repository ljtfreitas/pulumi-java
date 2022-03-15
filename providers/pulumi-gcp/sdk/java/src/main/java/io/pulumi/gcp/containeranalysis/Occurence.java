// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.containeranalysis.OccurenceArgs;
import io.pulumi.gcp.containeranalysis.inputs.OccurenceState;
import io.pulumi.gcp.containeranalysis.outputs.OccurenceAttestation;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An occurrence is an instance of a Note, or type of analysis that
 * can be done for a resource.
 * 
 * To get more information about Occurrence, see:
 * 
 * * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/container-analysis/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Occurrence can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:containeranalysis/occurence:Occurence default projects/{{project}}/occurrences/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:containeranalysis/occurence:Occurence default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:containeranalysis/occurence:Occurence default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:containeranalysis/occurence:Occurence")
public class Occurence extends io.pulumi.resources.CustomResource {
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
    @Export(name="attestation", type=OccurenceAttestation.class, parameters={})
    private Output<OccurenceAttestation> attestation;

    /**
     * @return Occurrence that represents a single "attestation". The authenticity
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
    public Output<OccurenceAttestation> getAttestation() {
        return this.attestation;
    }
    /**
     * The time when the repository was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the repository was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The note kind which explicitly denotes which of the occurrence details are specified. This field can be used as a filter
     * in list requests.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The note kind which explicitly denotes which of the occurrence details are specified. This field can be used as a filter
     * in list requests.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the occurrence.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the occurrence.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The analysis note associated with this occurrence, in the form of
     * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
     * filter in list requests.
     * 
     */
    @Export(name="noteName", type=String.class, parameters={})
    private Output<String> noteName;

    /**
     * @return The analysis note associated with this occurrence, in the form of
     * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
     * filter in list requests.
     * 
     */
    public Output<String> getNoteName() {
        return this.noteName;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @Export(name="remediation", type=String.class, parameters={})
    private Output</* @Nullable */ String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    public Output</* @Nullable */ String> getRemediation() {
        return this.remediation;
    }
    /**
     * Required. Immutable. A URI that represents the resource for which
     * the occurrence applies. For example,
     * https://gcr.io/project/image@sha256:123abc for a Docker image.
     * 
     */
    @Export(name="resourceUri", type=String.class, parameters={})
    private Output<String> resourceUri;

    /**
     * @return Required. Immutable. A URI that represents the resource for which
     * the occurrence applies. For example,
     * https://gcr.io/project/image@sha256:123abc for a Docker image.
     * 
     */
    public Output<String> getResourceUri() {
        return this.resourceUri;
    }
    /**
     * The time when the repository was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the repository was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(OccurenceArgs.Builder a);
    }
    private static io.pulumi.gcp.containeranalysis.OccurenceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.containeranalysis.OccurenceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Occurence(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Occurence(String name) {
        this(name, OccurenceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Occurence(String name, OccurenceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Occurence(String name, OccurenceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:containeranalysis/occurence:Occurence", name, args == null ? OccurenceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Occurence(String name, Output<String> id, @Nullable OccurenceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:containeranalysis/occurence:Occurence", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Occurence get(String name, Output<String> id, @Nullable OccurenceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Occurence(name, id, state, options);
    }
}
