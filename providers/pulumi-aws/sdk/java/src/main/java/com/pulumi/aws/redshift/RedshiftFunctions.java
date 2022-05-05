// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.inputs.GetClusterArgs;
import com.pulumi.aws.redshift.inputs.GetOrderableClusterArgs;
import com.pulumi.aws.redshift.inputs.GetServiceAccountArgs;
import com.pulumi.aws.redshift.outputs.GetClusterResult;
import com.pulumi.aws.redshift.outputs.GetOrderableClusterResult;
import com.pulumi.aws.redshift.outputs.GetServiceAccountResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RedshiftFunctions {
    /**
     * Provides details about a specific redshift cluster.
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
     *         final var example = Output.of(RedshiftFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterIdentifier(&#34;example-cluster&#34;)
     *             .build()));
     * 
     *         var exampleStream = new FirehoseDeliveryStream(&#34;exampleStream&#34;, FirehoseDeliveryStreamArgs.builder()        
     *             .destination(&#34;redshift&#34;)
     *             .s3Configuration(FirehoseDeliveryStreamS3Configuration.builder()
     *                 .roleArn(aws_iam_role.getFirehose_role().getArn())
     *                 .bucketArn(aws_s3_bucket.getBucket().getArn())
     *                 .bufferSize(10)
     *                 .bufferInterval(400)
     *                 .compressionFormat(&#34;GZIP&#34;)
     *                 .build())
     *             .redshiftConfiguration(FirehoseDeliveryStreamRedshiftConfiguration.builder()
     *                 .roleArn(aws_iam_role.getFirehose_role().getArn())
     *                 .clusterJdbcurl(String.format(&#34;jdbc:redshift://%s/%s&#34;, example.apply(getClusterResult -&gt; getClusterResult.getEndpoint()),example.apply(getClusterResult -&gt; getClusterResult.getDatabaseName())))
     *                 .username(&#34;exampleuser&#34;)
     *                 .password(&#34;Exampl3Pass&#34;)
     *                 .dataTableName(&#34;example-table&#34;)
     *                 .copyOptions(&#34;delimiter &#39;|&#39;&#34;)
     *                 .dataTableColumns(&#34;example-col&#34;)
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:redshift/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about Redshift Orderable Clusters and valid parameter combinations.
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
     *         final var test = Output.of(RedshiftFunctions.getOrderableCluster(GetOrderableClusterArgs.builder()
     *             .clusterType(&#34;multi-node&#34;)
     *             .preferredNodeTypes(            
     *                 &#34;dc2.large&#34;,
     *                 &#34;ds2.xlarge&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrderableClusterResult> getOrderableCluster() {
        return getOrderableCluster(GetOrderableClusterArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrderableClusterResult> getOrderableCluster(GetOrderableClusterArgs args) {
        return getOrderableCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrderableClusterResult> getOrderableCluster(GetOrderableClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:redshift/getOrderableCluster:getOrderableCluster", TypeShape.of(GetOrderableClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the Account ID of the [AWS Redshift Service Account](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * in a given region for the purpose of allowing Redshift to store audit data in S3.
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
     *         final var main = Output.of(RedshiftFunctions.getServiceAccount());
     * 
     *         var bucket = new BucketV2(&#34;bucket&#34;, BucketV2Args.builder()        
     *             .forceDestroy(true)
     *             .build());
     * 
     *         var allowAuditLogging = new BucketPolicy(&#34;allowAuditLogging&#34;, BucketPolicyArgs.builder()        
     *             .bucket(bucket.getId())
     *             .policy(&#34;&#34;&#34;
     * {
     * 	&#34;Version&#34;: &#34;2008-10-17&#34;,
     * 	&#34;Statement&#34;: [
     * 		{
     *             &#34;Sid&#34;: &#34;Put bucket policy needed for audit logging&#34;,
     *             &#34;Effect&#34;: &#34;Allow&#34;,
     *             &#34;Principal&#34;: {
     * 		        &#34;AWS&#34;: &#34;%s&#34;
     *             },
     *             &#34;Action&#34;: &#34;s3:PutObject&#34;,
     *             &#34;Resource&#34;: &#34;arn:aws:s3:::tf-redshift-logging-test-bucket/*&#34;
     *         },
     *         {
     *             &#34;Sid&#34;: &#34;Get bucket policy needed for audit logging &#34;,
     *             &#34;Effect&#34;: &#34;Allow&#34;,
     *             &#34;Principal&#34;: {
     * 		        &#34;AWS&#34;: &#34;%s&#34;
     *             },
     *             &#34;Action&#34;: &#34;s3:GetBucketAcl&#34;,
     *             &#34;Resource&#34;: &#34;arn:aws:s3:::tf-redshift-logging-test-bucket&#34;
     *         }
     * 	]
     * }
     * &#34;, main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn()),main.apply(getServiceAccountResult -&gt; getServiceAccountResult.getArn())))
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> getServiceAccount() {
        return getServiceAccount(GetServiceAccountArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args) {
        return getServiceAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:redshift/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
}
