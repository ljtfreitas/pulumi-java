// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codedeploy.DeploymentGroupArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupState;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupAlarmConfiguration;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupAutoRollbackConfiguration;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupBlueGreenDeploymentConfig;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupDeploymentStyle;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupEc2TagFilter;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupEc2TagSet;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupEcsService;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfo;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupOnPremisesInstanceTagFilter;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupTriggerConfiguration;
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
 * Provides a CodeDeploy Deployment Group for a CodeDeploy Application
 * 
 * &gt; **NOTE on blue/green deployments:** When using `green_fleet_provisioning_option` with the `COPY_AUTO_SCALING_GROUP` action, CodeDeploy will create a new ASG with a different name. This ASG is _not_ managed by this provider and will conflict with existing configuration and state. You may want to use a different approach to managing deployments that involve multiple ASG, such as `DISCOVER_EXISTING` with separate blue and green ASG.
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
 *         var exampleRole = new Role(&#34;exampleRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Sid&#34;: &#34;&#34;,
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;codedeploy.amazonaws.com&#34;
 *       },
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var aWSCodeDeployRole = new RolePolicyAttachment(&#34;aWSCodeDeployRole&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/service-role/AWSCodeDeployRole&#34;)
 *             .role(exampleRole.getName())
 *             .build());
 * 
 *         var exampleApplication = new Application(&#34;exampleApplication&#34;);
 * 
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;);
 * 
 *         var exampleDeploymentGroup = new DeploymentGroup(&#34;exampleDeploymentGroup&#34;, DeploymentGroupArgs.builder()        
 *             .appName(exampleApplication.getName())
 *             .deploymentGroupName(&#34;example-group&#34;)
 *             .serviceRoleArn(exampleRole.getArn())
 *             .ec2TagSets(DeploymentGroupEc2TagSet.builder()
 *                 .ec2TagFilters(                
 *                     DeploymentGroupEc2TagSetEc2TagFilter.builder()
 *                         .key(&#34;filterkey1&#34;)
 *                         .type(&#34;KEY_AND_VALUE&#34;)
 *                         .value(&#34;filtervalue&#34;)
 *                         .build(),
 *                     DeploymentGroupEc2TagSetEc2TagFilter.builder()
 *                         .key(&#34;filterkey2&#34;)
 *                         .type(&#34;KEY_AND_VALUE&#34;)
 *                         .value(&#34;filtervalue&#34;)
 *                         .build())
 *                 .build())
 *             .triggerConfigurations(DeploymentGroupTriggerConfiguration.builder()
 *                 .triggerEvents(&#34;DeploymentFailure&#34;)
 *                 .triggerName(&#34;example-trigger&#34;)
 *                 .triggerTargetArn(exampleTopic.getArn())
 *                 .build())
 *             .autoRollbackConfiguration(DeploymentGroupAutoRollbackConfiguration.builder()
 *                 .enabled(true)
 *                 .events(&#34;DEPLOYMENT_FAILURE&#34;)
 *                 .build())
 *             .alarmConfiguration(DeploymentGroupAlarmConfiguration.builder()
 *                 .alarms(&#34;my-alarm-name&#34;)
 *                 .enabled(true)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Blue Green Deployments with ECS
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
 *         var exampleApplication = new Application(&#34;exampleApplication&#34;, ApplicationArgs.builder()        
 *             .computePlatform(&#34;ECS&#34;)
 *             .build());
 * 
 *         var exampleDeploymentGroup = new DeploymentGroup(&#34;exampleDeploymentGroup&#34;, DeploymentGroupArgs.builder()        
 *             .appName(exampleApplication.getName())
 *             .deploymentConfigName(&#34;CodeDeployDefault.ECSAllAtOnce&#34;)
 *             .deploymentGroupName(&#34;example&#34;)
 *             .serviceRoleArn(aws_iam_role.getExample().getArn())
 *             .autoRollbackConfiguration(DeploymentGroupAutoRollbackConfiguration.builder()
 *                 .enabled(true)
 *                 .events(&#34;DEPLOYMENT_FAILURE&#34;)
 *                 .build())
 *             .blueGreenDeploymentConfig(DeploymentGroupBlueGreenDeploymentConfig.builder()
 *                 .deploymentReadyOption(DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.builder()
 *                     .actionOnTimeout(&#34;CONTINUE_DEPLOYMENT&#34;)
 *                     .build())
 *                 .terminateBlueInstancesOnDeploymentSuccess(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess.builder()
 *                     .action(&#34;TERMINATE&#34;)
 *                     .terminationWaitTimeInMinutes(5)
 *                     .build())
 *                 .build())
 *             .deploymentStyle(DeploymentGroupDeploymentStyle.builder()
 *                 .deploymentOption(&#34;WITH_TRAFFIC_CONTROL&#34;)
 *                 .deploymentType(&#34;BLUE_GREEN&#34;)
 *                 .build())
 *             .ecsService(DeploymentGroupEcsService.builder()
 *                 .clusterName(aws_ecs_cluster.getExample().getName())
 *                 .serviceName(aws_ecs_service.getExample().getName())
 *                 .build())
 *             .loadBalancerInfo(DeploymentGroupLoadBalancerInfo.builder()
 *                 .targetGroupPairInfo(DeploymentGroupLoadBalancerInfoTargetGroupPairInfo.builder()
 *                     .prodTrafficRoute(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute.builder()
 *                         .listenerArns(aws_lb_listener.getExample().getArn())
 *                         .build())
 *                     .targetGroups(                    
 *                         DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup.builder()
 *                             .name(aws_lb_target_group.getBlue().getName())
 *                             .build(),
 *                         DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup.builder()
 *                             .name(aws_lb_target_group.getGreen().getName())
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Blue Green Deployments with Servers and Classic ELB
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
 *         var exampleApplication = new Application(&#34;exampleApplication&#34;);
 * 
 *         var exampleDeploymentGroup = new DeploymentGroup(&#34;exampleDeploymentGroup&#34;, DeploymentGroupArgs.builder()        
 *             .appName(exampleApplication.getName())
 *             .deploymentGroupName(&#34;example-group&#34;)
 *             .serviceRoleArn(aws_iam_role.getExample().getArn())
 *             .deploymentStyle(DeploymentGroupDeploymentStyle.builder()
 *                 .deploymentOption(&#34;WITH_TRAFFIC_CONTROL&#34;)
 *                 .deploymentType(&#34;BLUE_GREEN&#34;)
 *                 .build())
 *             .loadBalancerInfo(DeploymentGroupLoadBalancerInfo.builder()
 *                 .elbInfos(DeploymentGroupLoadBalancerInfoElbInfo.builder()
 *                     .name(aws_elb.getExample().getName())
 *                     .build())
 *                 .build())
 *             .blueGreenDeploymentConfig(DeploymentGroupBlueGreenDeploymentConfig.builder()
 *                 .deploymentReadyOption(DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.builder()
 *                     .actionOnTimeout(&#34;STOP_DEPLOYMENT&#34;)
 *                     .waitTimeInMinutes(60)
 *                     .build())
 *                 .greenFleetProvisioningOption(DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption.builder()
 *                     .action(&#34;DISCOVER_EXISTING&#34;)
 *                     .build())
 *                 .terminateBlueInstancesOnDeploymentSuccess(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess.builder()
 *                     .action(&#34;KEEP_ALIVE&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * CodeDeploy Deployment Groups can be imported by their `app_name`, a colon, and `deployment_group_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codedeploy/deploymentGroup:DeploymentGroup example my-application:my-deployment-group
 * ```
 * 
 *  [1]http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html
 * 
 */
@ResourceType(type="aws:codedeploy/deploymentGroup:DeploymentGroup")
public class DeploymentGroup extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    @Export(name="alarmConfiguration", type=DeploymentGroupAlarmConfiguration.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupAlarmConfiguration> alarmConfiguration;

    /**
     * @return Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    public Output<Optional<DeploymentGroupAlarmConfiguration>> alarmConfiguration() {
        return Codegen.optional(this.alarmConfiguration);
    }
    /**
     * The name of the application.
     * 
     */
    @Export(name="appName", type=String.class, parameters={})
    private Output<String> appName;

    /**
     * @return The name of the application.
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }
    /**
     * The ARN of the CodeDeploy deployment group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the CodeDeploy deployment group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    @Export(name="autoRollbackConfiguration", type=DeploymentGroupAutoRollbackConfiguration.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration;

    /**
     * @return Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    public Output<Optional<DeploymentGroupAutoRollbackConfiguration>> autoRollbackConfiguration() {
        return Codegen.optional(this.autoRollbackConfiguration);
    }
    /**
     * Autoscaling groups associated with the deployment group.
     * 
     */
    @Export(name="autoscalingGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> autoscalingGroups;

    /**
     * @return Autoscaling groups associated with the deployment group.
     * 
     */
    public Output<Optional<List<String>>> autoscalingGroups() {
        return Codegen.optional(this.autoscalingGroups);
    }
    /**
     * Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    @Export(name="blueGreenDeploymentConfig", type=DeploymentGroupBlueGreenDeploymentConfig.class, parameters={})
    private Output<DeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig;

    /**
     * @return Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    public Output<DeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig() {
        return this.blueGreenDeploymentConfig;
    }
    /**
     * The destination platform type for the deployment.
     * 
     */
    @Export(name="computePlatform", type=String.class, parameters={})
    private Output<String> computePlatform;

    /**
     * @return The destination platform type for the deployment.
     * 
     */
    public Output<String> computePlatform() {
        return this.computePlatform;
    }
    /**
     * The name of the group&#39;s deployment config. The default is &#34;CodeDeployDefault.OneAtATime&#34;.
     * 
     */
    @Export(name="deploymentConfigName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentConfigName;

    /**
     * @return The name of the group&#39;s deployment config. The default is &#34;CodeDeployDefault.OneAtATime&#34;.
     * 
     */
    public Output<Optional<String>> deploymentConfigName() {
        return Codegen.optional(this.deploymentConfigName);
    }
    /**
     * The ID of the CodeDeploy deployment group.
     * 
     */
    @Export(name="deploymentGroupId", type=String.class, parameters={})
    private Output<String> deploymentGroupId;

    /**
     * @return The ID of the CodeDeploy deployment group.
     * 
     */
    public Output<String> deploymentGroupId() {
        return this.deploymentGroupId;
    }
    /**
     * The name of the deployment group.
     * 
     */
    @Export(name="deploymentGroupName", type=String.class, parameters={})
    private Output<String> deploymentGroupName;

    /**
     * @return The name of the deployment group.
     * 
     */
    public Output<String> deploymentGroupName() {
        return this.deploymentGroupName;
    }
    /**
     * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    @Export(name="deploymentStyle", type=DeploymentGroupDeploymentStyle.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupDeploymentStyle> deploymentStyle;

    /**
     * @return Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    public Output<Optional<DeploymentGroupDeploymentStyle>> deploymentStyle() {
        return Codegen.optional(this.deploymentStyle);
    }
    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    @Export(name="ec2TagFilters", type=List.class, parameters={DeploymentGroupEc2TagFilter.class})
    private Output</* @Nullable */ List<DeploymentGroupEc2TagFilter>> ec2TagFilters;

    /**
     * @return Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    public Output<Optional<List<DeploymentGroupEc2TagFilter>>> ec2TagFilters() {
        return Codegen.optional(this.ec2TagFilters);
    }
    /**
     * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    @Export(name="ec2TagSets", type=List.class, parameters={DeploymentGroupEc2TagSet.class})
    private Output</* @Nullable */ List<DeploymentGroupEc2TagSet>> ec2TagSets;

    /**
     * @return Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    public Output<Optional<List<DeploymentGroupEc2TagSet>>> ec2TagSets() {
        return Codegen.optional(this.ec2TagSets);
    }
    /**
     * Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    @Export(name="ecsService", type=DeploymentGroupEcsService.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupEcsService> ecsService;

    /**
     * @return Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    public Output<Optional<DeploymentGroupEcsService>> ecsService() {
        return Codegen.optional(this.ecsService);
    }
    /**
     * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    @Export(name="loadBalancerInfo", type=DeploymentGroupLoadBalancerInfo.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupLoadBalancerInfo> loadBalancerInfo;

    /**
     * @return Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    public Output<Optional<DeploymentGroupLoadBalancerInfo>> loadBalancerInfo() {
        return Codegen.optional(this.loadBalancerInfo);
    }
    /**
     * On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    @Export(name="onPremisesInstanceTagFilters", type=List.class, parameters={DeploymentGroupOnPremisesInstanceTagFilter.class})
    private Output</* @Nullable */ List<DeploymentGroupOnPremisesInstanceTagFilter>> onPremisesInstanceTagFilters;

    /**
     * @return On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    public Output<Optional<List<DeploymentGroupOnPremisesInstanceTagFilter>>> onPremisesInstanceTagFilters() {
        return Codegen.optional(this.onPremisesInstanceTagFilters);
    }
    /**
     * The service role ARN that allows deployments.
     * 
     */
    @Export(name="serviceRoleArn", type=String.class, parameters={})
    private Output<String> serviceRoleArn;

    /**
     * @return The service role ARN that allows deployments.
     * 
     */
    public Output<String> serviceRoleArn() {
        return this.serviceRoleArn;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    @Export(name="triggerConfigurations", type=List.class, parameters={DeploymentGroupTriggerConfiguration.class})
    private Output</* @Nullable */ List<DeploymentGroupTriggerConfiguration>> triggerConfigurations;

    /**
     * @return Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    public Output<Optional<List<DeploymentGroupTriggerConfiguration>>> triggerConfigurations() {
        return Codegen.optional(this.triggerConfigurations);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentGroup(String name) {
        this(name, DeploymentGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentGroup(String name, DeploymentGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentGroup(String name, DeploymentGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codedeploy/deploymentGroup:DeploymentGroup", name, args == null ? DeploymentGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentGroup(String name, Output<String> id, @Nullable DeploymentGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codedeploy/deploymentGroup:DeploymentGroup", name, state, makeResourceOptions(options, id));
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
    public static DeploymentGroup get(String name, Output<String> id, @Nullable DeploymentGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentGroup(name, id, state, options);
    }
}
