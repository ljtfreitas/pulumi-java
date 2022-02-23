// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.signer.SigningProfileArgs;
import io.pulumi.aws.signer.inputs.SigningProfileState;
import io.pulumi.aws.signer.outputs.SigningProfileRevocationRecord;
import io.pulumi.aws.signer.outputs.SigningProfileSignatureValidityPeriod;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Signer Signing Profile. A signing profile contains information about the code signing configuration parameters that can be used by a given code signing user.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Signer signing profiles can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:signer/signingProfile:SigningProfile test_signer_signing_profile test_sp_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK
 * ```
 * 
 */
@ResourceType(type="aws:signer/signingProfile:SigningProfile")
public class SigningProfile extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    @OutputExport(name="platformDisplayName", type=String.class, parameters={})
    private Output<String> platformDisplayName;

    /**
     * @return A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    public Output<String> getPlatformDisplayName() {
        return this.platformDisplayName;
    }
    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @OutputExport(name="platformId", type=String.class, parameters={})
    private Output<String> platformId;

    /**
     * @return The ID of the platform that is used by the target signing profile.
     * 
     */
    public Output<String> getPlatformId() {
        return this.platformId;
    }
    /**
     * Revocation information for a signing profile.
     * 
     */
    @OutputExport(name="revocationRecords", type=List.class, parameters={SigningProfileRevocationRecord.class})
    private Output<List<SigningProfileRevocationRecord>> revocationRecords;

    /**
     * @return Revocation information for a signing profile.
     * 
     */
    public Output<List<SigningProfileRevocationRecord>> getRevocationRecords() {
        return this.revocationRecords;
    }
    /**
     * The validity period for a signing job.
     * 
     */
    @OutputExport(name="signatureValidityPeriod", type=SigningProfileSignatureValidityPeriod.class, parameters={})
    private Output<SigningProfileSignatureValidityPeriod> signatureValidityPeriod;

    /**
     * @return The validity period for a signing job.
     * 
     */
    public Output<SigningProfileSignatureValidityPeriod> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod;
    }
    /**
     * The status of the target signing profile.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the target signing profile.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The current version of the signing profile.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The current version of the signing profile.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }
    /**
     * The signing profile ARN, including the profile version.
     * 
     */
    @OutputExport(name="versionArn", type=String.class, parameters={})
    private Output<String> versionArn;

    /**
     * @return The signing profile ARN, including the profile version.
     * 
     */
    public Output<String> getVersionArn() {
        return this.versionArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SigningProfile(String name, SigningProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingProfile:SigningProfile", name, args == null ? SigningProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SigningProfile(String name, Input<String> id, @Nullable SigningProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingProfile:SigningProfile", name, state, makeResourceOptions(options, id));
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
    public static SigningProfile get(String name, Input<String> id, @Nullable SigningProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SigningProfile(name, id, state, options);
    }
}
