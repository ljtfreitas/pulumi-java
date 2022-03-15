// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gameservices.RealmArgs;
import io.pulumi.gcp.gameservices.inputs.RealmState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Realm resource.
 * 
 * To get more information about Realm, see:
 * 
 * * [API documentation](https://cloud.google.com/game-servers/docs/reference/rest/v1beta/projects.locations.realms)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/game-servers/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Realm can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/realm:Realm default projects/{{project}}/locations/{{location}}/realms/{{realm_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/realm:Realm default {{project}}/{{location}}/{{realm_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/realm:Realm default {{location}}/{{realm_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gameservices/realm:Realm")
public class Realm extends io.pulumi.resources.CustomResource {
    /**
     * Human readable description of the realm.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human readable description of the realm.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * ETag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return ETag of the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Location of the Realm.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the Realm.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource id of the realm, of the form: 'projects/{project_id}/locations/{location}/realms/{realm_id}'. For example,
     * 'projects/my-project/locations/{location}/realms/my-realm'.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource id of the realm, of the form: 'projects/{project_id}/locations/{location}/realms/{realm_id}'. For example,
     * 'projects/my-project/locations/{location}/realms/my-realm'.
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
     * GCP region of the Realm.
     * 
     */
    @Export(name="realmId", type=String.class, parameters={})
    private Output<String> realmId;

    /**
     * @return GCP region of the Realm.
     * 
     */
    public Output<String> getRealmId() {
        return this.realmId;
    }
    /**
     * Required. Time zone where all realm-specific policies are evaluated. The value of
     * this field must be from the IANA time zone database:
     * https://www.iana.org/time-zones.
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return Required. Time zone where all realm-specific policies are evaluated. The value of
     * this field must be from the IANA time zone database:
     * https://www.iana.org/time-zones.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public interface BuilderApplicator {
        public void apply(RealmArgs.Builder a);
    }
    private static io.pulumi.gcp.gameservices.RealmArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.gameservices.RealmArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Realm(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Realm(String name) {
        this(name, RealmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Realm(String name, RealmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Realm(String name, RealmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/realm:Realm", name, args == null ? RealmArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Realm(String name, Output<String> id, @Nullable RealmState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/realm:Realm", name, state, makeResourceOptions(options, id));
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
    public static Realm get(String name, Output<String> id, @Nullable RealmState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Realm(name, id, state, options);
    }
}
