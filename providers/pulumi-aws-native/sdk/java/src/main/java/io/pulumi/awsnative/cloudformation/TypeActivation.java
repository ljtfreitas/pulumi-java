// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.TypeActivationArgs;
import io.pulumi.awsnative.cloudformation.enums.TypeActivationType;
import io.pulumi.awsnative.cloudformation.enums.TypeActivationVersionBump;
import io.pulumi.awsnative.cloudformation.outputs.TypeActivationLoggingConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:cloudformation:TypeActivation")
public class TypeActivation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="autoUpdate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpdate;

    public Output</* @Nullable */ Boolean> getAutoUpdate() {
        return this.autoUpdate;
    }
    @OutputExport(name="executionRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> executionRoleArn;

    public Output</* @Nullable */ String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    @OutputExport(name="loggingConfig", type=TypeActivationLoggingConfig.class, parameters={})
    private Output</* @Nullable */ TypeActivationLoggingConfig> loggingConfig;

    public Output</* @Nullable */ TypeActivationLoggingConfig> getLoggingConfig() {
        return this.loggingConfig;
    }
    @OutputExport(name="majorVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> majorVersion;

    public Output</* @Nullable */ String> getMajorVersion() {
        return this.majorVersion;
    }
    @OutputExport(name="publicTypeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicTypeArn;

    public Output</* @Nullable */ String> getPublicTypeArn() {
        return this.publicTypeArn;
    }
    @OutputExport(name="publisherId", type=String.class, parameters={})
    private Output</* @Nullable */ String> publisherId;

    public Output</* @Nullable */ String> getPublisherId() {
        return this.publisherId;
    }
    @OutputExport(name="type", type=TypeActivationType.class, parameters={})
    private Output</* @Nullable */ TypeActivationType> type;

    public Output</* @Nullable */ TypeActivationType> getType() {
        return this.type;
    }
    @OutputExport(name="typeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeName;

    public Output</* @Nullable */ String> getTypeName() {
        return this.typeName;
    }
    @OutputExport(name="typeNameAlias", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeNameAlias;

    public Output</* @Nullable */ String> getTypeNameAlias() {
        return this.typeNameAlias;
    }
    @OutputExport(name="versionBump", type=TypeActivationVersionBump.class, parameters={})
    private Output</* @Nullable */ TypeActivationVersionBump> versionBump;

    public Output</* @Nullable */ TypeActivationVersionBump> getVersionBump() {
        return this.versionBump;
    }

    public TypeActivation(String name, @Nullable TypeActivationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:TypeActivation", name, args == null ? TypeActivationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TypeActivation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:TypeActivation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TypeActivation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TypeActivation(name, id, options);
    }
}