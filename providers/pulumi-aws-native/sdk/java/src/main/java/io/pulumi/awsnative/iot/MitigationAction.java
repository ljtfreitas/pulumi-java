// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.MitigationActionArgs;
import io.pulumi.awsnative.iot.outputs.MitigationActionActionParams;
import io.pulumi.awsnative.iot.outputs.MitigationActionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iot:MitigationAction")
public class MitigationAction extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> actionName;

    public Output</* @Nullable */ String> getActionName() {
        return this.actionName;
    }
    @OutputExport(name="actionParams", type=MitigationActionActionParams.class, parameters={})
    private Output<MitigationActionActionParams> actionParams;

    public Output<MitigationActionActionParams> getActionParams() {
        return this.actionParams;
    }
    @OutputExport(name="mitigationActionArn", type=String.class, parameters={})
    private Output<String> mitigationActionArn;

    public Output<String> getMitigationActionArn() {
        return this.mitigationActionArn;
    }
    @OutputExport(name="mitigationActionId", type=String.class, parameters={})
    private Output<String> mitigationActionId;

    public Output<String> getMitigationActionId() {
        return this.mitigationActionId;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="tags", type=List.class, parameters={MitigationActionTag.class})
    private Output</* @Nullable */ List<MitigationActionTag>> tags;

    public Output</* @Nullable */ List<MitigationActionTag>> getTags() {
        return this.tags;
    }

    public MitigationAction(String name, MitigationActionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:MitigationAction", name, args == null ? MitigationActionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MitigationAction(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:MitigationAction", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MitigationAction get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MitigationAction(name, id, options);
    }
}