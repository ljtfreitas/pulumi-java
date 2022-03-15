// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apikeys_v2.KeyArgs;
import io.pulumi.googlenative.apikeys_v2.outputs.V2RestrictionsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new API key. NOTE: Key is a global resource; hence the only supported value for location is `global`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apikeys/v2:Key")
public class Key extends io.pulumi.resources.CustomResource {
    /**
     * A timestamp identifying the time this key was originally created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return A timestamp identifying the time this key was originally created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
     * 
     */
    @Export(name="keyString", type=String.class, parameters={})
    private Output<String> keyString;

    /**
     * @return An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
     * 
     */
    public Output<String> getKeyString() {
        return this.keyString;
    }
    /**
     * The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key restrictions.
     * 
     */
    @Export(name="restrictions", type=V2RestrictionsResponse.class, parameters={})
    private Output<V2RestrictionsResponse> restrictions;

    /**
     * @return Key restrictions.
     * 
     */
    public Output<V2RestrictionsResponse> getRestrictions() {
        return this.restrictions;
    }
    /**
     * Unique id in UUID4 format.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Unique id in UUID4 format.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * A timestamp identifying the time this key was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return A timestamp identifying the time this key was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable KeyArgs.Builder a);
    }
    private static io.pulumi.googlenative.apikeys_v2.KeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apikeys_v2.KeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Key(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, @Nullable KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, @Nullable KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apikeys/v2:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Key(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apikeys/v2:Key", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Key get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
