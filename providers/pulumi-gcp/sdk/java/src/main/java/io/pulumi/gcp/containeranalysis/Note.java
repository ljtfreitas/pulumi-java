// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.containeranalysis.NoteArgs;
import io.pulumi.gcp.containeranalysis.inputs.NoteState;
import io.pulumi.gcp.containeranalysis.outputs.NoteAttestationAuthority;
import io.pulumi.gcp.containeranalysis.outputs.NoteRelatedUrl;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Container Analysis note is a high-level piece of metadata that
 * describes a type of analysis that can be done for a resource.
 * 
 * To get more information about Note, see:
 * 
 * * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/container-analysis/)
 *     * [Creating Attestations (Occurrences)](https://cloud.google.com/binary-authorization/docs/making-attestations)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Note can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:containeranalysis/note:Note default projects/{{project}}/notes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:containeranalysis/note:Note default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:containeranalysis/note:Note default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:containeranalysis/note:Note")
public class Note extends io.pulumi.resources.CustomResource {
    /**
     * Note kind that represents a logical attestation "role" or "authority".
     * For example, an organization might have one AttestationAuthority for
     * "QA" and one for "build". This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don't all live in the same
     * project.
     * Structure is documented below.
     * 
     */
    @Export(name="attestationAuthority", type=NoteAttestationAuthority.class, parameters={})
    private Output<NoteAttestationAuthority> attestationAuthority;

    /**
     * @return Note kind that represents a logical attestation "role" or "authority".
     * For example, an organization might have one AttestationAuthority for
     * "QA" and one for "build". This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don't all live in the same
     * project.
     * Structure is documented below.
     * 
     */
    public Output<NoteAttestationAuthority> getAttestationAuthority() {
        return this.attestationAuthority;
    }
    /**
     * The time this note was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time this note was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Time of expiration for this note. Leave empty if note does not expire.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationTime;

    /**
     * @return Time of expiration for this note. Leave empty if note does not expire.
     * 
     */
    public Output</* @Nullable */ String> getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * The type of analysis this note describes
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The type of analysis this note describes
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A detailed description of the note
     * 
     */
    @Export(name="longDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> longDescription;

    /**
     * @return A detailed description of the note
     * 
     */
    public Output</* @Nullable */ String> getLongDescription() {
        return this.longDescription;
    }
    /**
     * The name of the note.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the note.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * Names of other notes related to this note.
     * 
     */
    @Export(name="relatedNoteNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> relatedNoteNames;

    /**
     * @return Names of other notes related to this note.
     * 
     */
    public Output</* @Nullable */ List<String>> getRelatedNoteNames() {
        return this.relatedNoteNames;
    }
    /**
     * URLs associated with this note and related metadata.
     * Structure is documented below.
     * 
     */
    @Export(name="relatedUrls", type=List.class, parameters={NoteRelatedUrl.class})
    private Output</* @Nullable */ List<NoteRelatedUrl>> relatedUrls;

    /**
     * @return URLs associated with this note and related metadata.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<NoteRelatedUrl>> getRelatedUrls() {
        return this.relatedUrls;
    }
    /**
     * A one sentence description of the note.
     * 
     */
    @Export(name="shortDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> shortDescription;

    /**
     * @return A one sentence description of the note.
     * 
     */
    public Output</* @Nullable */ String> getShortDescription() {
        return this.shortDescription;
    }
    /**
     * The time this note was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time this note was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(NoteArgs.Builder a);
    }
    private static io.pulumi.gcp.containeranalysis.NoteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.containeranalysis.NoteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Note(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Note(String name) {
        this(name, NoteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Note(String name, NoteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Note(String name, NoteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:containeranalysis/note:Note", name, args == null ? NoteArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Note(String name, Output<String> id, @Nullable NoteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:containeranalysis/note:Note", name, state, makeResourceOptions(options, id));
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
    public static Note get(String name, Output<String> id, @Nullable NoteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Note(name, id, state, options);
    }
}
