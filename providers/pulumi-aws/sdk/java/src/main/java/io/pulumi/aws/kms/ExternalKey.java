// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kms.ExternalKeyArgs;
import io.pulumi.aws.kms.inputs.ExternalKeyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a KMS Customer Master Key that uses external key material. To instead manage a KMS Customer Master Key where AWS automatically generates and potentially rotates key material, see the `aws.kms.Key` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * KMS External Keys can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kms/externalKey:ExternalKey a arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:kms/externalKey:ExternalKey")
public class ExternalKey extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the key.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the key.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies whether to disable the policy lockout check performed when creating or updating the key's policy. Setting this value to `true` increases the risk that the key becomes unmanageable. For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the AWS Key Management Service Developer Guide. Defaults to `false`.
     * 
     */
    @OutputExport(name="bypassPolicyLockoutSafetyCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return Specifies whether to disable the policy lockout check performed when creating or updating the key's policy. Setting this value to `true` increases the risk that the key becomes unmanageable. For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the AWS Key Management Service Developer Guide. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }
    /**
     * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
     * 
     */
    @OutputExport(name="deletionWindowInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deletionWindowInDays;

    /**
     * @return Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
     * 
     */
    public Output</* @Nullable */ Integer> getDeletionWindowInDays() {
        return this.deletionWindowInDays;
    }
    /**
     * Description of the key.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the key.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    @OutputExport(name="expirationModel", type=String.class, parameters={})
    private Output<String> expirationModel;

    /**
     * @return Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    public Output<String> getExpirationModel() {
        return this.expirationModel;
    }
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
     * 
     */
    @OutputExport(name="keyMaterialBase64", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyMaterialBase64;

    /**
     * @return Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
     * 
     */
    public Output</* @Nullable */ String> getKeyMaterialBase64() {
        return this.keyMaterialBase64;
    }
    /**
     * The state of the CMK.
     * 
     */
    @OutputExport(name="keyState", type=String.class, parameters={})
    private Output<String> keyState;

    /**
     * @return The state of the CMK.
     * 
     */
    public Output<String> getKeyState() {
        return this.keyState;
    }
    /**
     * The cryptographic operations for which you can use the CMK.
     * 
     */
    @OutputExport(name="keyUsage", type=String.class, parameters={})
    private Output<String> keyUsage;

    /**
     * @return The cryptographic operations for which you can use the CMK.
     * 
     */
    public Output<String> getKeyUsage() {
        return this.keyUsage;
    }
    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @OutputExport(name="multiRegion", type=Boolean.class, parameters={})
    private Output<Boolean> multiRegion;

    /**
     * @return Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    public Output<Boolean> getMultiRegion() {
        return this.multiRegion;
    }
    /**
     * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * A key-value map of tags to assign to the key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A key-value map of tags to assign to the key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @OutputExport(name="validTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> validTo;

    /**
     * @return Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    public Output</* @Nullable */ String> getValidTo() {
        return this.validTo;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalKey(String name, @Nullable ExternalKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/externalKey:ExternalKey", name, args == null ? ExternalKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExternalKey(String name, Input<String> id, @Nullable ExternalKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/externalKey:ExternalKey", name, state, makeResourceOptions(options, id));
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
    public static ExternalKey get(String name, Input<String> id, @Nullable ExternalKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExternalKey(name, id, state, options);
    }
}
