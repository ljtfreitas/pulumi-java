// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.BackendServiceSignedUrlKeyArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceSignedUrlKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A key for signing Cloud CDN signed URLs for Backend Services.
 * 
 * To get more information about BackendServiceSignedUrlKey, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/backendServices)
 * * How-to Guides
 *     * [Using Signed URLs](https://cloud.google.com/cdn/docs/using-signed-urls/)
 * 
 * > **Warning:** All arguments including `key_value` will be stored in the raw
 * state as plain-text.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:compute/backendServiceSignedUrlKey:BackendServiceSignedUrlKey")
public class BackendServiceSignedUrlKey extends io.pulumi.resources.CustomResource {
    /**
     * The backend service this signed URL key belongs.
     * 
     */
    @Export(name="backendService", type=String.class, parameters={})
    private Output<String> backendService;

    /**
     * @return The backend service this signed URL key belongs.
     * 
     */
    public Output<String> backendService() {
        return this.backendService;
    }
    /**
     * 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="keyValue", type=String.class, parameters={})
    private Output<String> keyValue;

    /**
     * @return 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> keyValue() {
        return this.keyValue;
    }
    /**
     * Name of the signed URL key.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the signed URL key.
     * 
     */
    public Output<String> name() {
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
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendServiceSignedUrlKey(String name) {
        this(name, BackendServiceSignedUrlKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendServiceSignedUrlKey(String name, BackendServiceSignedUrlKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendServiceSignedUrlKey(String name, BackendServiceSignedUrlKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendServiceSignedUrlKey:BackendServiceSignedUrlKey", name, args == null ? BackendServiceSignedUrlKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackendServiceSignedUrlKey(String name, Output<String> id, @Nullable BackendServiceSignedUrlKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendServiceSignedUrlKey:BackendServiceSignedUrlKey", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static BackendServiceSignedUrlKey get(String name, Output<String> id, @Nullable BackendServiceSignedUrlKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackendServiceSignedUrlKey(name, id, state, options);
    }
}
