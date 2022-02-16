// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.signer.SigningProfileArgs;
import io.pulumi.awsnative.signer.enums.SigningProfilePlatformId;
import io.pulumi.awsnative.signer.outputs.SigningProfileSignatureValidityPeriod;
import io.pulumi.awsnative.signer.outputs.SigningProfileTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:signer:SigningProfile")
public class SigningProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="platformId", type=SigningProfilePlatformId.class, parameters={})
    private Output<SigningProfilePlatformId> platformId;

    public Output<SigningProfilePlatformId> getPlatformId() {
        return this.platformId;
    }
    @OutputExport(name="profileName", type=String.class, parameters={})
    private Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
    }
    @OutputExport(name="profileVersion", type=String.class, parameters={})
    private Output<String> profileVersion;

    public Output<String> getProfileVersion() {
        return this.profileVersion;
    }
    @OutputExport(name="profileVersionArn", type=String.class, parameters={})
    private Output<String> profileVersionArn;

    public Output<String> getProfileVersionArn() {
        return this.profileVersionArn;
    }
    @OutputExport(name="signatureValidityPeriod", type=SigningProfileSignatureValidityPeriod.class, parameters={})
    private Output</* @Nullable */ SigningProfileSignatureValidityPeriod> signatureValidityPeriod;

    public Output</* @Nullable */ SigningProfileSignatureValidityPeriod> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod;
    }
    @OutputExport(name="tags", type=List.class, parameters={SigningProfileTag.class})
    private Output</* @Nullable */ List<SigningProfileTag>> tags;

    public Output</* @Nullable */ List<SigningProfileTag>> getTags() {
        return this.tags;
    }

    public SigningProfile(String name, SigningProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:signer:SigningProfile", name, args == null ? SigningProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SigningProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:signer:SigningProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SigningProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SigningProfile(name, id, options);
    }
}