// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.guardduty.IPSetArgs;
import io.pulumi.aws.guardduty.inputs.IPSetState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty IPSet.
 * 
 * > **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage IPSets. IPSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-ip-set.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty IPSet can be imported using the the primary GuardDuty detector ID and IPSet ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/iPSet:IPSet MyIPSet 00b00fd5aecc0ab60a708659477e9617:123456789012
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/iPSet:IPSet")
public class IPSet extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether GuardDuty is to start using the uploaded IPSet.
     * 
     */
    @OutputExport(name="activate", type=Boolean.class, parameters={})
    private Output<Boolean> activate;

    /**
     * @return Specifies whether GuardDuty is to start using the uploaded IPSet.
     * 
     */
    public Output<Boolean> getActivate() {
        return this.activate;
    }
    /**
     * Amazon Resource Name (ARN) of the GuardDuty IPSet.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the GuardDuty IPSet.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @OutputExport(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty.
     * 
     */
    public Output<String> getDetectorId() {
        return this.detectorId;
    }
    /**
     * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    @OutputExport(name="format", type=String.class, parameters={})
    private Output<String> format;

    /**
     * @return The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    public Output<String> getFormat() {
        return this.format;
    }
    /**
     * The URI of the file that contains the IPSet.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The URI of the file that contains the IPSet.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The friendly name to identify the IPSet.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The friendly name to identify the IPSet.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPSet(String name, IPSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/iPSet:IPSet", name, args == null ? IPSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IPSet(String name, Input<String> id, @Nullable IPSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/iPSet:IPSet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static IPSet get(String name, Input<String> id, @Nullable IPSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IPSet(name, id, state, options);
    }
}
