// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.AmiFromInstanceArgs;
import com.pulumi.aws.ec2.inputs.AmiFromInstanceState;
import com.pulumi.aws.ec2.outputs.AmiFromInstanceEbsBlockDevice;
import com.pulumi.aws.ec2.outputs.AmiFromInstanceEphemeralBlockDevice;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The &#34;AMI from instance&#34; resource allows the creation of an Amazon Machine
 * Image (AMI) modelled after an existing EBS-backed EC2 instance.
 * 
 * The created AMI will refer to implicitly-created snapshots of the instance&#39;s
 * EBS volumes and mimick its assigned block device configuration at the time
 * the resource is created.
 * 
 * This resource is best applied to an instance that is stopped when this instance
 * is created, so that the contents of the created image are predictable. When
 * applied to an instance that is running, *the instance will be stopped before taking
 * the snapshots and then started back up again*, resulting in a period of
 * downtime.
 * 
 * Note that the source instance is inspected only at the initial creation of this
 * resource. Ongoing updates to the referenced instance will not be propagated into
 * the generated AMI. Users may taint or otherwise recreate the resource in order
 * to produce a fresh snapshot.
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
 *         var example = new AmiFromInstance(&#34;example&#34;, AmiFromInstanceArgs.builder()        
 *             .sourceInstanceId(&#34;i-xxxxxxxx&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:ec2/amiFromInstance:AmiFromInstance")
public class AmiFromInstance extends com.pulumi.resources.CustomResource {
    /**
     * Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    @Export(name="architecture", type=String.class, parameters={})
    private Output<String> architecture;

    /**
     * @return Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    public Output<String> architecture() {
        return this.architecture;
    }
    /**
     * The ARN of the AMI.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the AMI.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    @Export(name="bootMode", type=String.class, parameters={})
    private Output<String> bootMode;

    /**
     * @return The boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    public Output<String> bootMode() {
        return this.bootMode;
    }
    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A longer, human-readable description for the AMI.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Export(name="ebsBlockDevices", type=List.class, parameters={AmiFromInstanceEbsBlockDevice.class})
    private Output<List<AmiFromInstanceEbsBlockDevice>> ebsBlockDevices;

    /**
     * @return Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    public Output<List<AmiFromInstanceEbsBlockDevice>> ebsBlockDevices() {
        return this.ebsBlockDevices;
    }
    /**
     * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    @Export(name="enaSupport", type=Boolean.class, parameters={})
    private Output<Boolean> enaSupport;

    /**
     * @return Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    public Output<Boolean> enaSupport() {
        return this.enaSupport;
    }
    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Export(name="ephemeralBlockDevices", type=List.class, parameters={AmiFromInstanceEphemeralBlockDevice.class})
    private Output<List<AmiFromInstanceEphemeralBlockDevice>> ephemeralBlockDevices;

    /**
     * @return Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    public Output<List<AmiFromInstanceEphemeralBlockDevice>> ephemeralBlockDevices() {
        return this.ephemeralBlockDevices;
    }
    @Export(name="hypervisor", type=String.class, parameters={})
    private Output<String> hypervisor;

    public Output<String> hypervisor() {
        return this.hypervisor;
    }
    /**
     * Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    @Export(name="imageLocation", type=String.class, parameters={})
    private Output<String> imageLocation;

    /**
     * @return Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    public Output<String> imageLocation() {
        return this.imageLocation;
    }
    @Export(name="imageOwnerAlias", type=String.class, parameters={})
    private Output<String> imageOwnerAlias;

    public Output<String> imageOwnerAlias() {
        return this.imageOwnerAlias;
    }
    @Export(name="imageType", type=String.class, parameters={})
    private Output<String> imageType;

    public Output<String> imageType() {
        return this.imageType;
    }
    /**
     * The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    @Export(name="kernelId", type=String.class, parameters={})
    private Output<String> kernelId;

    /**
     * @return The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    public Output<String> kernelId() {
        return this.kernelId;
    }
    @Export(name="manageEbsSnapshots", type=Boolean.class, parameters={})
    private Output<Boolean> manageEbsSnapshots;

    public Output<Boolean> manageEbsSnapshots() {
        return this.manageEbsSnapshots;
    }
    /**
     * A region-unique name for the AMI.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    public Output<String> ownerId() {
        return this.ownerId;
    }
    @Export(name="platform", type=String.class, parameters={})
    private Output<String> platform;

    public Output<String> platform() {
        return this.platform;
    }
    @Export(name="platformDetails", type=String.class, parameters={})
    private Output<String> platformDetails;

    public Output<String> platformDetails() {
        return this.platformDetails;
    }
    @Export(name="public", type=Boolean.class, parameters={})
    private Output<Boolean> public_;

    public Output<Boolean> public_() {
        return this.public_;
    }
    /**
     * The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    @Export(name="ramdiskId", type=String.class, parameters={})
    private Output<String> ramdiskId;

    /**
     * @return The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    public Output<String> ramdiskId() {
        return this.ramdiskId;
    }
    /**
     * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    @Export(name="rootDeviceName", type=String.class, parameters={})
    private Output<String> rootDeviceName;

    /**
     * @return The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    public Output<String> rootDeviceName() {
        return this.rootDeviceName;
    }
    @Export(name="rootSnapshotId", type=String.class, parameters={})
    private Output<String> rootSnapshotId;

    public Output<String> rootSnapshotId() {
        return this.rootSnapshotId;
    }
    /**
     * Boolean that overrides the behavior of stopping
     * the instance before snapshotting. This is risky since it may cause a snapshot of an
     * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
     * guarantees that no filesystem writes will be underway at the time of snapshot.
     * 
     */
    @Export(name="snapshotWithoutReboot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> snapshotWithoutReboot;

    /**
     * @return Boolean that overrides the behavior of stopping
     * the instance before snapshotting. This is risky since it may cause a snapshot of an
     * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
     * guarantees that no filesystem writes will be underway at the time of snapshot.
     * 
     */
    public Output<Optional<Boolean>> snapshotWithoutReboot() {
        return Codegen.optional(this.snapshotWithoutReboot);
    }
    /**
     * The id of the instance to use as the basis of the AMI.
     * 
     */
    @Export(name="sourceInstanceId", type=String.class, parameters={})
    private Output<String> sourceInstanceId;

    /**
     * @return The id of the instance to use as the basis of the AMI.
     * 
     */
    public Output<String> sourceInstanceId() {
        return this.sourceInstanceId;
    }
    /**
     * When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    @Export(name="sriovNetSupport", type=String.class, parameters={})
    private Output<String> sriovNetSupport;

    /**
     * @return When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    public Output<String> sriovNetSupport() {
        return this.sriovNetSupport;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    @Export(name="usageOperation", type=String.class, parameters={})
    private Output<String> usageOperation;

    public Output<String> usageOperation() {
        return this.usageOperation;
    }
    /**
     * Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    @Export(name="virtualizationType", type=String.class, parameters={})
    private Output<String> virtualizationType;

    /**
     * @return Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    public Output<String> virtualizationType() {
        return this.virtualizationType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AmiFromInstance(String name) {
        this(name, AmiFromInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AmiFromInstance(String name, AmiFromInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AmiFromInstance(String name, AmiFromInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/amiFromInstance:AmiFromInstance", name, args == null ? AmiFromInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AmiFromInstance(String name, Output<String> id, @Nullable AmiFromInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/amiFromInstance:AmiFromInstance", name, state, makeResourceOptions(options, id));
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
    public static AmiFromInstance get(String name, Output<String> id, @Nullable AmiFromInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AmiFromInstance(name, id, state, options);
    }
}
