// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.macie.SessionArgs;
import io.pulumi.awsnative.macie.enums.SessionFindingPublishingFrequency;
import io.pulumi.awsnative.macie.enums.SessionStatus;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:macie:Session")
public class Session extends io.pulumi.resources.CustomResource {
    @OutputExport(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }
    @OutputExport(name="findingPublishingFrequency", type=SessionFindingPublishingFrequency.class, parameters={})
    private Output</* @Nullable */ SessionFindingPublishingFrequency> findingPublishingFrequency;

    public Output</* @Nullable */ SessionFindingPublishingFrequency> getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }
    @OutputExport(name="serviceRole", type=String.class, parameters={})
    private Output<String> serviceRole;

    public Output<String> getServiceRole() {
        return this.serviceRole;
    }
    @OutputExport(name="status", type=SessionStatus.class, parameters={})
    private Output</* @Nullable */ SessionStatus> status;

    public Output</* @Nullable */ SessionStatus> getStatus() {
        return this.status;
    }

    public Session(String name, @Nullable SessionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:macie:Session", name, args == null ? SessionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Session(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:macie:Session", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Session get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Session(name, id, options);
    }
}