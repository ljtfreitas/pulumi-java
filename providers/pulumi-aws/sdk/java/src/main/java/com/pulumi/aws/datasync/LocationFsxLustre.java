// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datasync.LocationFsxLustreArgs;
import com.pulumi.aws.datasync.inputs.LocationFsxLustreState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS DataSync FSx Lustre Location.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new LocationFsxLustre(&#34;example&#34;, LocationFsxLustreArgs.builder()        
 *             .fsxFilesystemArn(aws_fsx_lustre_file_system.getExample().getArn())
 *             .securityGroupArns(aws_security_group.getExample().getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_datasync_location_fsx_lustre_file_system` can be imported by using the `DataSync-ARN#FSx-Lustre-ARN`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:datasync/locationFsxLustre:LocationFsxLustre example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:476956259333:file-system/fs-08e04cd442c1bb94a
 * ```
 * 
 */
@ResourceType(type="aws:datasync/locationFsxLustre:LocationFsxLustre")
public class LocationFsxLustre extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The time that the FSx for Lustre location was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time that the FSx for Lustre location was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * 
     */
    @Export(name="fsxFilesystemArn", type=String.class, parameters={})
    private Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * 
     */
    public Output<String> fsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }
    /**
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
     * 
     */
    @Export(name="securityGroupArns", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
     * 
     */
    public Output<List<String>> securityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * Subdirectory to perform actions as source or destination.
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination.
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The URL of the FSx for Lustre location that was described.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return The URL of the FSx for Lustre location that was described.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationFsxLustre(String name) {
        this(name, LocationFsxLustreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationFsxLustre(String name, LocationFsxLustreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationFsxLustre(String name, LocationFsxLustreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationFsxLustre:LocationFsxLustre", name, args == null ? LocationFsxLustreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationFsxLustre(String name, Output<String> id, @Nullable LocationFsxLustreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationFsxLustre:LocationFsxLustre", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static LocationFsxLustre get(String name, Output<String> id, @Nullable LocationFsxLustreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationFsxLustre(name, id, state, options);
    }
}
